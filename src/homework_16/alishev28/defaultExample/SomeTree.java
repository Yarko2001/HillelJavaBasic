package homework_16.alishev28.defaultExample;

public class SomeTree {
    String name;
    int age;

    public SomeTree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Tree is " + name + "," + "Age is " + age);
    }
}
