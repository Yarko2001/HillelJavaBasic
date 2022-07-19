package homework_20.alishev_35.example_2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal2 = new Animal() {
            @Override
            public void eat() {
                System.out.println("Other animal is eating...");
            }
        };
        animal2.eat();
    }
}
