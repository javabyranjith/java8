package jbr.java8.functional.interfaces;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import jbr.java8.model.Gender;
import jbr.java8.model.Person;

/**
 * Examples of Function Interface. It will be used when we want to return a particular type (R) for a input type (T).
 * 
 * @author Ranjith Sekar (java2ranjith@gmail.com)
 *
 * @date 28-Feb-2017
 */
public class FunctionInterface {

  public static void main(String[] args) {

    List<Person> persons = Arrays
        .asList(new Person[] { new Person("Sekar", "Chinnappan", Gender.MALE, "Hydrabad", 55, 88000),
            /*
             * new Person("Ranjith", "Sekar", Gender.MALE, "Chennai", 23, 96000), new Person("Kabilan", "Ranjith",
             * Gender.MALE, "Bangalore", 3, 86000),
             */
            new Person("Nivedha", "Ranjith", Gender.FEMALE, "Delhi", 1, 97000) });

    // OLD WAY
    System.out.println("OLD WAY (FIRST NAME FIRST)");
    for (Person p : persons)
      p.firstNameFirst();

    System.out.println("\nOLD WAY (LAST NAME FIRST)");
    for (Person p : persons)
      p.lastNameFirst();

    // NEW WAY
    System.out.println("\nUSING FUNCTION INTERFACE (FIRST NAME FIRST)");
    Function<Person, String> firstNameFirst = p -> "Name: " + p.getFirstname() + "," + p.getLastname() + "\nAddress: "
        + p.getAddress() + "\nPhone: " + p.getPhone();
    for (Person person : persons)
      System.out.println(person.printMe(firstNameFirst));

    // persons.forEach(Person::printMe(firstNameFirst));

    System.out.println("\nUSING FUNCTION INTERFACE (LAST NAME FIRST)");
    Function<Person, String> lastNameFirst = p -> "Name: " + p.getLastname() + "," + p.getFirstname() + "\nAddress: "
        + p.getAddress() + "\nPhone: " + p.getPhone();
    for (Person person : persons)
      System.out.println(person.printMe(lastNameFirst));

    System.out.println("\nMAP as RERTURN TYPE");
    Function<Person, Map<String, String>> firstNameFirstMap = p ->
      {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("Name", p.getFirstname() + " " + p.getLastname());
        map.put("Address", p.getAddress());
        map.put("Phone", String.valueOf(p.getPhone()));
        return map;
      };

    for (Person person : persons) {
      System.out.println(person.printMeMap(firstNameFirstMap)
          .values());
    }
  }
}
