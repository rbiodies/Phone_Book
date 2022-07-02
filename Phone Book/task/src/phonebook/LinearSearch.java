package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static phonebook.Main.takeTime;

public class LinearSearch {

    public static void useLinearSearch(List<String> phonebook, File find) throws FileNotFoundException {
        System.out.println("Start searching (linear search)...");

        long startSearch = System.currentTimeMillis();

        doLinearSearch(phonebook, find);

        System.out.printf(" Time taken: %s\n\n", takeTime(startSearch));
    }

    public static void doLinearSearch(List<String> phonebook, File find) throws FileNotFoundException {
        Scanner scanner = new Scanner(find);
        int countFind = 0;
        int countAll = 0;

        while (scanner.hasNext()) {
            countAll++;
            if (linearSearch(phonebook, scanner.nextLine()) != -1) {
                countFind++;
            }
        }
        System.out.printf("Found %d / %d entries.", countFind, countAll);
    }

    public static int linearSearch(List<String> phonebook, String find) {
        for (int i = 0; i < phonebook.size(); i++) {
            if (Objects.equals(phonebook.get(i), find)) {
                return i;
            }
        }
        return -1;
    }
}
