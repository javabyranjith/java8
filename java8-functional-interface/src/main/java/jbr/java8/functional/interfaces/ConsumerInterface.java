package jbr.java8.functional.interfaces;

import java.util.List;
import java.util.function.Consumer;

import jbr.java8.model.Person;

/**
 * Examples for Consumer Interface. It will be used when we want to access any object and perform some operations on it.
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class ConsumerInterface {

  public static void main(String[] args) {
    Consumer<Person> age = (Person p) -> p.getAge();
    Consumer<List<String>> isEmpty = (List<String> list) -> list.isEmpty();
  }
}
