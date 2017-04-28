package jbr.java8.method.reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import jbr.java8.model.Gender;
import jbr.java8.model.Person;

/**
 * Method reference examples.
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class MethodReferenceExample {

  public static void main(String[] args) {
    List<Person> persons = Arrays.asList(new Person[] { new Person("A", "a", Gender.MALE, "Hydrabad", 55, 88000),
        new Person("B", "b", Gender.MALE, "Chennai", 23, 96000),
        new Person("C", "c", Gender.MALE, "Bangalore", 3, 86000),
        new Person("D", "d", Gender.FEMALE, "Delhi", 1, 97000) });

    persons.forEach(Person::firstNameFirst);
    persons.forEach(p -> Person.getName()); // calling static method

    System.out.println("=============");
    Consumer<Person> consumer = Person::firstNameFirst;
    consumer.accept(new Person("E", "e", Gender.MALE, "Kerala", 33, 87874));
    persons.forEach(consumer);

    System.out.println("=============");
    consumer.accept(new Person("F", "f", Gender.MALE, "Kerala", 22, 34343));
    persons.forEach(consumer);

    System.out.println("=============");
    persons.forEach(Person::firstNameFirst);
  }
}
