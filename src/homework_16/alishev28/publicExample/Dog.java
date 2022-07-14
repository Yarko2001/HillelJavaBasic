package homework_16.alishev28.publicExample;

public class Dog {
    public String name;
    public int age;
    public double weight;

    public Dog() {
    }

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void sayGaw() {
        System.out.println("Gaw...Gaw...Gaw...");
    }

    public void showInfoDog() {
        System.out.println("The name's dog is " + name + "," + "it's " + age + " years old" + "," + "it's weight is " + weight);
    }
}
