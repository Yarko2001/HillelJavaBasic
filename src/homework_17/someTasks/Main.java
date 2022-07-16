package homework_17.someTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);
        ListIterator<Integer> iterators = numbersList.listIterator();
        while (iterators.hasNext()) {
            iterators.set(iterators.next() + 1);
        }
        for (Integer number : numbersList) {
            System.out.println(number);
        }
    }
}
