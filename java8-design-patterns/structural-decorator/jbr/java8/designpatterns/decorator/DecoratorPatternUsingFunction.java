/**
 * 
 */
package jbr.java8.designpatterns.decorator;

import java.util.function.Function;

/**
 * An Example program for Decorator Design Pattern using Function Interface.
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class DecoratorPatternUsingFunction {

  public static void main(String[] args) {

    Function<Integer, Integer> increment = e -> e + 1;
    int result = calc(10, increment);
    System.out.println("Sum: " + result);

    Function<Integer, Integer> multiplication = e -> e * 2;
    result = calc(10, multiplication);
    System.out.println("Multi: " + result);

    // Sum + Multiplication
    result = calc(10, increment.andThen(multiplication));
    System.out.println("Sum and Multi: " + result);

    Function<Integer, Integer> division = e -> e / 2;
    result = calc(10, division);
    System.out.println("Division: " + result);

    // Sum + Multiplication + Division
    result = calc(10, increment.andThen(multiplication)
        .andThen(division));
    System.out.println("Sum, Multi and Division: " + result);

  }

  public static int calc(int value, Function<Integer, Integer> operation) {
    return operation.apply(value);
  }
}
