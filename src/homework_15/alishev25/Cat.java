package homework_15.alishev25;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    public void meow() {
        System.out.println("I am meowing...");
    }

    public void showName() {
        System.out.println("Cat's name " + catName);
    }
}
