package oo.dog;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Bilu", "Pug");
        System.out.println(dog.getName() + ", " + dog.getBreed());

        dog.setName("Lulu");
        dog.setBreed("Bulldog");

        System.out.println(dog.getName() + ", " + dog.getBreed());
        }
    }
