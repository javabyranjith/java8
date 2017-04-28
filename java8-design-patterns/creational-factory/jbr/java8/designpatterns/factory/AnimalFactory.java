package jbr.java8.designpatterns.factory;

public class AnimalFactory {

  public Animal getAnimal(String animalName) {
    if (animalName.equalsIgnoreCase("tiger")) {
      return new Tiger();
    } else if (animalName.equalsIgnoreCase("dog")) {
      return new Dog();
    }
    return null;
  }
}
