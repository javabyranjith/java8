package jbr.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import jbr.java8.model.Gender1;
import jbr.java8.model.Person1;
import jbr.java8.model.PersonCategory1;

/**
 * Examples of Stream Functions (sum, average, et.,)
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class StreamFunctions {

  public static void main(String[] args) {
    List<Person1> persons = Arrays
        .asList(new Person1[] { new Person1("Sekar", "Chinnappan", Gender1.MALE, "Hyderabad", 55, 88000),
            new Person1("Ranjith", "Sekar", Gender1.MALE, "Chennai", 23, 96000),
            new Person1("Kabilan", "Ranjith", Gender1.MALE, "Bangalore", 3, 86000),
            new Person1("Nivedha", "Ranjith", Gender1.FEMALE, "Delhi", 1, 97000) });
    // sum
    int ageSum = persons.stream()
        .filter(PredicateInterface.getCategory(PersonCategory1.CHILDREN))
        .mapToInt(p -> p.getAge())
        .sum();
    System.out.println("Age Sum: " + ageSum);

    // average
    OptionalDouble ageAverage = persons.stream()
        .filter(PredicateInterface.getCategory(PersonCategory1.CHILDREN))
        .mapToDouble(p -> p.getAge())
        .average();
    System.out.println("Age Average: " + ageAverage.getAsDouble());

  }
}
