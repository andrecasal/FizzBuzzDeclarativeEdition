import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class FizzBuzz {

	private static class Rule {
		final int divisor;
		final String output;

		Rule(int divisor, String output) {
			this.divisor = divisor;
			this.output = output;
		}
	}

	public static void run() {
		try {
			Properties config = loadConfiguration();
			FizzBuzzEngine engine = new FizzBuzzEngine(config);
			engine.execute();
		} catch (IOException e) {
			System.err.println("Failed to load configuration: " + e.getMessage());
		}
	}

	private static Properties loadConfiguration() throws IOException {
		Properties props = new Properties();
		try (InputStream input = FizzBuzz.class.getResourceAsStream("/fizzbuzz-rules.properties")) {
			if (input == null) {
				// Fallback to loading from current directory
				try (InputStream fallback = FizzBuzz.class.getClassLoader()
						.getResourceAsStream("fizzbuzz-rules.properties")) {
					if (fallback != null) {
						props.load(fallback);
					} else {
						// Load from file system as last resort
						props.load(new java.io.FileInputStream("fizzbuzz-rules.properties"));
					}
				}
			} else {
				props.load(input);
			}
		}
		return props;
	}

	private static class FizzBuzzEngine {
		private final int start;
		private final int end;
		private final List<Rule> rules;
		private final String defaultOutput;

		public FizzBuzzEngine(Properties config) {
			this.start = Integer.parseInt(config.getProperty("fizzbuzz.start", "1"));
			this.end = Integer.parseInt(config.getProperty("fizzbuzz.end", "100"));
			this.rules = parseRules(config);
			this.defaultOutput = config.getProperty("rule.default", "NUMBER");
		}

		private List<Rule> parseRules(Properties config) {
			Map<Integer, Rule> ruleMap = new TreeMap<>();

			for (String key : config.stringPropertyNames()) {
				if (key.startsWith("rule.") && key.endsWith(".divisor")) {
					String ruleNumber = key.substring(5, key.lastIndexOf('.'));
					int divisor = Integer.parseInt(config.getProperty(key));
					String output = config.getProperty("rule." + ruleNumber + ".output");
					if (output != null) {
						ruleMap.put(Integer.parseInt(ruleNumber), new Rule(divisor, output));
					}
				}
			}

			return new ArrayList<>(ruleMap.values());
		}

		public void execute() {
			for (int i = start; i <= end; i++) {
				System.out.println(evaluateNumber(i));
			}
		}

		private String evaluateNumber(int number) {
			for (Rule rule : rules) {
				if (number % rule.divisor == 0) {
					return rule.output;
				}
			}
			return defaultOutput.equals("NUMBER") ? String.valueOf(number) : defaultOutput;
		}
	}
}
