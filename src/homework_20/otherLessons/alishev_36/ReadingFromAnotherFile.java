package homework_20.otherLessons.alishev_36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromAnotherFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "kitne" + separator + "Desktop";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.hasNextLine());
        }
        scanner.close();
    }
}
