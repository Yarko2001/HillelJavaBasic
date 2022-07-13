package homework_15.alishev26;

import homework_15.alishev26.Interfaces.Info;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(24);
        Person person = new Person("Jack");
        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
