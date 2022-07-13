package homework_15.alishev26;

import homework_15.alishev26.Interfaces.Info;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
