# FizzBuzzDeclarativeEdition

A FizzBuzz implementation using declarative programming principles in Java, focusing on what should happen rather than how it should be implemented.

## About FizzBuzz

FizzBuzz is a classic programming problem used in interviews to test basic programming skills. The rules are:

For numbers 1 through 100:
* If the number is divisible by 3, print "Fizz"
* If the number is divisible by 5, print "Buzz" 
* If the number is divisible by both 3 and 5 (15), print "FizzBuzz"
* Otherwise, print the number

## Programming Paradigm

This implementation demonstrates **declarative programming** principles:

- **What, not How**: You declare what should happen, not how it should be implemented
- **Expression-based**: Logic is expressed through mathematical relationships
- **Functional Composition**: Complex behavior built from simple expressions
- **Immutable Logic**: Rules are embedded in the code structure itself
- **Pattern Matching**: Uses conditional expressions to match patterns

### Key Declarative Features

1. **Mathematical Expressions**: Divisibility expressed as mathematical relationships
2. **Conditional Logic**: Uses ternary operators and conditional expressions
3. **Direct Mapping**: Numbers directly map to their string representations
4. **Embedded Rules**: Logic is expressed within the code structure
5. **Functional Style**: Emphasizes expressions over statements

## Running the Code

```bash
# Compile both classes
javac *.java

# Run
java Main
```

## Comparison with Other Editions

This repository is part of a programming paradigm showcase:

1. **[FizzBuzzImperativeEdition](../FizzBuzzImperativeEdition)** - Simple, procedural approach with for loops and if statements
2. **[FizzBuzzFunctionalEdition](../FizzBuzzFunctionalEdition)** - Functional programming with streams and predicates  
3. **[FizzBuzzObjectOrientedEdition](../FizzBuzzObjectOrientedEdition)** - Over-engineered enterprise OOP solution with patterns
4. **FizzBuzzDeclarativeEdition** (this repo) - Declarative approach using expressions and pattern matching

Each demonstrates different programming paradigms and approaches to solving the same problem.