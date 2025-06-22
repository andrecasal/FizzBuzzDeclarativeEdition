# FizzBuzzDeclarativeEdition

A FizzBuzz implementation using declarative programming principles in Java, where behavior is defined through configuration rather than imperative code.

## About FizzBuzz

FizzBuzz is a classic programming problem used in interviews to test basic programming skills. The rules are:

For numbers 1 through 100:
* If the number is divisible by 3, print "Fizz"
* If the number is divisible by 5, print "Buzz" 
* If the number is divisible by both 3 and 5 (15), print "FizzBuzz"
* Otherwise, print the number

## Programming Paradigm

This implementation demonstrates **declarative programming** principles:

- **Configuration-driven**: Rules are defined in `fizzbuzz-rules.properties` file
- **What, not How**: You declare what should happen, not how it should be implemented
- **Data-driven**: Business logic is externalized to configuration
- **Separation of Concerns**: Rules are separate from execution logic
- **Easily Configurable**: Change behavior without modifying code

### Key Declarative Features

1. **External Configuration**: All rules defined in properties file
2. **Rule-based Engine**: Generic engine that interprets configuration
3. **No Hard-coded Logic**: No explicit "if divisible by 3 then Fizz" in code
4. **Configurable Range**: Start and end numbers defined in config
5. **Extensible**: Add new rules without code changes

## Configuration

The `fizzbuzz-rules.properties` file defines:

```properties
# Range
fizzbuzz.start=1
fizzbuzz.end=100

# Rules (order matters)
rule.1.divisor=15
rule.1.output=FizzBuzz

rule.2.divisor=3
rule.2.output=Fizz

rule.3.divisor=5  
rule.3.output=Buzz

# Default for unmatched numbers
rule.default=NUMBER
```

## Running the Code

```bash
# Compile both classes
javac *.java

# Run (make sure fizzbuzz-rules.properties is in the same directory)
java Main
```

## Customization Examples

You can modify the behavior without changing code:

### Different Range
```properties
fizzbuzz.start=50
fizzbuzz.end=75
```

### Additional Rules
```properties
rule.4.divisor=7
rule.4.output=Boom
```

### Different Outputs
```properties
rule.2.output=Fizzy
rule.3.output=Buzzy
```

## Comparison with Other Editions

This repository is part of a programming paradigm showcase:

1. **[FizzBuzzImperativeEdition](../FizzBuzzImperativeEdition)** - Simple, procedural approach with for loops and if statements
2. **[FizzBuzzFunctionalEdition](../FizzBuzzFunctionalEdition)** - Functional programming with streams and predicates  
3. **[FizzBuzzObjectOrientedEdition](../FizzBuzzObjectOrientedEdition)** - Over-engineered enterprise OOP solution with patterns
4. **FizzBuzzDeclarativeEdition** (this repo) - Configuration-driven, rule-based approach

Each demonstrates different programming paradigms and approaches to solving the same problem.