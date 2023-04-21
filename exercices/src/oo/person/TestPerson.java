package oo.person;

public class TestPerson {

    public static void main(String[] args) {
        Person first = new Person("Pedro Leao", 28);

        System.out.println("Name: " + first.getName() + ", Age: "+ first.getAge());
    }
}
