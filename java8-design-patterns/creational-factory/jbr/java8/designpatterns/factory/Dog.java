package jbr.java8.designpatterns.factory;

public class Dog implements Animal {

  @Override
  public AnimalType animalType() {
    return AnimalType.DOMESTIC;
  }

}
