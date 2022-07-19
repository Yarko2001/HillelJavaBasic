package homework_20.alishev_35.example_3;

import homework_20.alishev_35.example_3.AbleToEat;

public class Main {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
        ableToEat.eat();
    }
}
