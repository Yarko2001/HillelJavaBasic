package lesson19.alishevLessons.alishev_32;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;

        Dog dog2 = (Dog) animal;
        dog2.bark();
    }
}
