package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static phonebook.BinarySearch.doBinarySearch;
import static phonebook.Main.takeTime;
import static phonebook.QuickSort.doQuickSort;

public class QuickSortBinarySearch {

    public static void useQuickSortBinarySearch(List<String> phonebook, File find) throws FileNotFoundException {
        List<String> copyPhonebook = new ArrayList<>(phonebook);

        System.out.println("Start searching (quick sort + binary search)...");

        long startSort = System.currentTimeMillis();

        doQuickSort(copyPhonebook);

        String sortTime = takeTime(startSort);
        long startSearch = System.currentTimeMillis();

        doBinarySearch(copyPhonebook, find);

        String searchTime = takeTime(startSearch);

        System.out.printf(" Time taken: %s\n", takeTime(startSort));
        System.out.printf("Sorting time: %s\n", sortTime);
        System.out.printf("Searching time: %s\n\n", searchTime);
    }
}

