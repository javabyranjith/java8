package jbr.java8.designpatterns.factory;

public class Tiger implements Animal {

  @Override
  public AnimalType animalType() {
    return AnimalType.WILD;
  }

}
