package homework_12;

public class PolymorphismTaskFifth {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void bark() {
        System.out.println("Dog is barking...");
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
