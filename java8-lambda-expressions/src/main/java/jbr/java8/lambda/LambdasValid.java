package jbr.java8.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.function.*;

import jbr.java8.model.Gender;
import jbr.java8.model.Person;

public class LambdasValid {
  public static void main(String[] args) {
    // Single parameter type String
    Function<String, Integer> length = (String s) -> s.length();
    Predicate<String> length1 = (String s) -> s.isEmpty();

    // Single parameter type - User defined Object
    Consumer<Person> age = (Person p) -> p.getAge();

    //
    Supplier<Integer> intVal = () -> 100;
    Supplier<String> stringVal1 = () -> "Ranjith";
    Supplier<String> StringVal2 = () ->
      {
        return "Ranjith";
      };

    // create an object.
    Supplier<Person> ranjith = () -> new Person("Ranjith", "Sekar", Gender.MALE, "Chennai", 30, 960006);

    // return boolean value
    Consumer<List<String>> isEmpty = (List<String> list) -> list.isEmpty();
    Predicate<List<String>> isEmpty1 = (List<String> list) -> !list.isEmpty();

    //
    BiFunction<Person, Person, Integer> comparator = (Person p1, Person p2) -> p1.getAge()
        .compareTo(p2.getAge());
    ToIntBiFunction<Person, Person> comparator1 = (Person p1, Person p2) -> p1.getAge()
        .compareTo(p2.getAge());
    Comparator<Person> comparator2 = (Person p1, Person p2) -> p1.getAge()
        .compareTo(p2.getAge());

 // Two Parameter with body
    BiConsumer<Integer, Integer> integerIntegerBiConsumer = (Integer a, Integer b) ->
    {
      System.out.println("Sum is: ");
      System.out.println(a + b);
    };

    // pass lambda expression as a parameter to a function
//    exectue(()->System.out.println("Hello"));

  }
}
