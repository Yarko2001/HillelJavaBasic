package homework_16;

import homework_16.forest.animals.Animal;
import homework_16.forest.animals.Bear;
import homework_16.forest.trees.Oak;
import homework_16.forest.trees.Tree;

public class Main {
    public static void main(String[] args) {
        Oak oak = new Oak();
        test(oak);
        Bear bear = new Bear();
        test2(bear);
    }

    public static void test(Tree tree) {
        tree.grow();
    }

    public static void test2(Animal animal) {
        animal.eat();
    }
}
