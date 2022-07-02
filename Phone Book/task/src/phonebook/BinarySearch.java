package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BinarySearch {

    public static void doBinarySearch(List<String> copyPhonebook, File find) throws FileNotFoundException {
        Scanner scanner = new Scanner(find);
        int countFind = 0;
        int countAll = 0;

        while (scanner.hasNext()) {
            countAll++;
            if (binarySearch(copyPhonebook, scanner.nextLine()) != -1) {
                countFind++;
            }
        }
        System.out.printf("Found %d / %d entries.", countFind, countAll);
    }

    public static int binarySearch(List<String> copyPhonebook, String name) {
        int left = 0;
        int right = copyPhonebook.size() - 1;

        while (left <= right) {

            int middle = left + (right - left) / 2;

            if (Objects.equals(copyPhonebook.get(middle), name)) {
                return middle;
            } else if (copyPhonebook.get(middle).compareTo(name) > 0) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
