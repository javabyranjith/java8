package jbr.java8.designpatterns.factory;

public class AnimalDemo {

  public static void main(String[] args) {
    AnimalFactory factory = new AnimalFactory();

    Animal dog = factory.getAnimal("dog");
    System.out.println("Dog is a " + dog.animalType().name() + " animal.");

    Animal tiger = factory.getAnimal("tiger");
    System.out.println("Tiger is a " + tiger.animalType().name() + " animal.");

    System.out.println("\nJava 8");
    AnimalFactoryNew factoryNew = new AnimalFactoryNew();
    System.out.println("Dog is a " + factoryNew.getAnimal("dog").animalType().name() + " animal.");
    System.out.println("Tiger is a " + factoryNew.getAnimal("tiger").animalType().name() + " animal.");
  }
}
