package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static phonebook.BubbleSortJumpSearch.useBubbleSortJumpSearch;
import static phonebook.HashTable.useHashTable;
import static phonebook.LinearSearch.useLinearSearch;
import static phonebook.QuickSortBinarySearch.useQuickSortBinarySearch;

public class Main {
    static long totalMs;

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        File directory = new File("./Phone Book/task/src/resources/small_directory.txt");
        File find = new File("./Phone Book/task/src/resources/small_find.txt");
        List<String> phonebook = readPhonebook(directory);

        useLinearSearch(phonebook, find);
        useBubbleSortJumpSearch(phonebook, find);
        useQuickSortBinarySearch(phonebook, find);
        useHashTable(phonebook, find);
    }

    public static List<String> readPhonebook(File directory) throws FileNotFoundException {
        Scanner scanner = new Scanner(directory);
        List<String> phonebook = new ArrayList<>();

        while (scanner.hasNext()) {
            scanner.nextInt();
            phonebook.add(scanner.nextLine().substring(1));
        }
        return phonebook;
    }

    public static String takeTime(long startTime) {
        // Получить системное время в миллисекундах, преобразованное в секунды
        long endTime = System.currentTimeMillis();

        totalMs = endTime - startTime;

        long totalSec = totalMs / 1000;

        // Находим милисекунды текущего времени
        long ms = totalMs % 1000;

        // Находим секунды текущего времени
        long sec = totalSec % 60;

        // Находим минуты текущего времени
        long min = totalSec / 60;

        return String.format("%d min. %d sec. %d ms.", min, sec, ms);
    }
}

