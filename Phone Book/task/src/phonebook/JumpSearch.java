package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static phonebook.BubbleSort.sortThread;
import static phonebook.LinearSearch.doLinearSearch;

public class JumpSearch {

    public static void doJumpSearch(List<String> copyPhonebook, File find) throws FileNotFoundException, InterruptedException {
        Scanner scanner = new Scanner(find);
        int countFind = 0;
        int countAll = 0;

        if (sortThread.isSorted()) {
            while (scanner.hasNext()) {
                countAll++;
                if (jumpSearch(copyPhonebook, scanner.nextLine()) != -1) {
                    countFind++;
                }
            }
            System.out.printf("Found %d / %d entries.", countFind, countAll);
        } else {
            doLinearSearch(copyPhonebook, find);
        }
    }

    public static int jumpSearch(List<String> copyPhonebook, String find) {
        double step = Math.floor(Math.sqrt(copyPhonebook.size()));

        int i = 0;
        while (i < copyPhonebook.size()) {
            if (Objects.equals(copyPhonebook.get(i), find)) {
                return i;
            } else if (copyPhonebook.get(i).compareTo(find) > 0) {
                int index = i - 1;

                while (index >= i - step && index >= 0) {

                    if (Objects.equals(copyPhonebook.get(index), find)) {
                        return index;
                    }
                    index -= 1;
                }
                return -1;
            }
            i = i + (int) step;
        }

        int index = copyPhonebook.size() - 1;

        while (index > i - step) {
            if (Objects.equals(copyPhonebook.get(index), find)) {
                return index;
            }
            index -= 1;
        }
        return -1;
    }
}

