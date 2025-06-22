import java.util.stream.IntStream;

public class FizzBuzz {
	public static void run() {
		IntStream.rangeClosed(1, 100)
			.mapToObj(FizzBuzz::mapToFizzBuzz)
			.forEach(System.out::println);
	}
	
	private static String mapToFizzBuzz(int n) {
		return n % 15 == 0 ? "FizzBuzz" :
		       n % 3 == 0 ? "Fizz" :
		       n % 5 == 0 ? "Buzz" :
		       String.valueOf(n);
	}
}
