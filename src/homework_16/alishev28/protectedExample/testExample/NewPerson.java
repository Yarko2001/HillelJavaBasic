package homework_16.alishev28.protectedExample.testExample;

import homework_16.alishev28.protectedExample.Person;

public class NewPerson extends Person {

    public NewPerson() {
        name = "Tom";
        age = 22;
    }

    public void showInfoPerson() {
        System.out.println("My name is " + name + "," + "I am " + age + " years old");
    }
}
