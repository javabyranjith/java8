package jbr.java8.designpatterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class AnimalFactoryNew {

  static Map<String, Supplier<Animal>> animals = new HashMap<>();

  static {
    animals.put("TIGER", Tiger::new);
    animals.put("DOG", Dog::new);
  }

  public Animal getAnimal(String animalName) {
    Supplier<Animal> animal = animals.get(animalName.toUpperCase());
    return animal.get();
  }
}
