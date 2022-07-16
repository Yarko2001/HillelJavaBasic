package homework_17.someTasks;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "Monkey");
        list.add(1, "Elephant");
        list.add(2, "Tiger");
        list.add(3, "Zebra");
        list.add(4, "Leopard");
        list.add(5, "Wolverine");
        list.add(6, "Wolf");
        list.add(7, "Giraffe");
        System.out.println(list);
        list.remove(7);
        list.remove(5);
        list.remove(3);
        System.out.println(list.size());
        System.out.println(list);
    }
}
