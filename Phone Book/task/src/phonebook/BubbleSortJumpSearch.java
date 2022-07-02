package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static phonebook.BubbleSort.*;
import static phonebook.JumpSearch.doJumpSearch;
import static phonebook.Main.takeTime;

public class BubbleSortJumpSearch {

    public static void useBubbleSortJumpSearch(List<String> phonebook, File find) throws InterruptedException, FileNotFoundException {
        List<String> copyPhonebook = new ArrayList<>(phonebook);

        System.out.println("Start searching (bubble sort + jump search)...");

        long startSort = System.currentTimeMillis();

        doBubbleSort(copyPhonebook);

        String sortTime = takeTime(startSort);
        long startSearch = System.currentTimeMillis();

        doJumpSearch(copyPhonebook, find);

        String searchTime = takeTime(startSearch);

        System.out.printf(" Time taken: %s\n", takeTime(startSort));

        if (sortThread.isSorted()) {
            System.out.printf("Sorting time: %s\n", sortTime);
        } else {
            System.out.printf("Sorting time: %s - STOPPED, moved to linear search\n", sortTime);
        }

        System.out.printf("Searching time: %s\n\n", searchTime);
    }
}
