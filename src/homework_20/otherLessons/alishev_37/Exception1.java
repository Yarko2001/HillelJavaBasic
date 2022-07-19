package homework_20.otherLessons.alishev_37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        File file = new File("ggff");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try catch");
    }
}
