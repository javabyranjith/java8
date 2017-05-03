package jbr.java8.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import jbr.java8.model.Gender1;
import jbr.java8.model.Person1;
import jbr.java8.model.PersonCategory1;

/**
 * Examples of Predicate Interface. Predicate Interface will be used when we need to represent a boolean expression that
 * will use the Object (T).
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class PredicateInterface {

  public static void main(String[] args) {
    List<Person1> persons = Arrays
        .asList(new Person1[] { new Person1("Sekar", "Chinnappan", Gender1.MALE, "Hydrabad", 55, 88000),
            new Person1("Ranjith", "Sekar", Gender1.MALE, "Chennai", 23, 96000),
            new Person1("Kabilan", "Ranjith", Gender1.MALE, "Bangalore", 3, 86000),
            new Person1("Nivedha", "Ranjith", Gender1.FEMALE, "Delhi", 1, 97000) });

    persons.stream()
        .filter(getCategory(PersonCategory1.OLD))
        .forEach(Person1::firstNameFirst);
  }

  public static Predicate<Person1> getCategory(PersonCategory1 category) {
    Map<PersonCategory1, Predicate<Person1>> categories = new HashMap<PersonCategory1, Predicate<Person1>>();

    Predicate<Person1> children = p -> p.getAge() < 12;
    Predicate<Person1> teenage = p -> p.getAge() > 12 && p.getAge() < 25;
    Predicate<Person1> older = p -> p.getAge() > 25;

    categories.put(PersonCategory1.CHILDREN, children);
    categories.put(PersonCategory1.TEEN, teenage);
    categories.put(PersonCategory1.OLD, older);

    return categories.get(category);
  }

}