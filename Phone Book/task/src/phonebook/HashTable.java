package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

import static phonebook.Main.takeTime;

public class HashTable {

    public static void useHashTable(List<String> phonebook, File find) throws FileNotFoundException {
        System.out.println("Start searching (hash table)...");

        long startCreate = System.currentTimeMillis();
        Hashtable<String, Integer> copyPhonebook = new Hashtable<>();

        createHashTable(phonebook, copyPhonebook);

        String timeCreate = takeTime(startCreate);
        long startSearch = System.currentTimeMillis();

        searchHashTable(copyPhonebook, find);

        String searchTime = takeTime(startSearch);

        System.out.printf(" Time taken: %s\n", takeTime(startCreate));
        System.out.printf("Creating time: %s\n", timeCreate);
        System.out.printf("Searching time: %s\n\n", searchTime);
    }

    public static void createHashTable(List<String> phonebook, Hashtable<String, Integer> copyPhonebook) {
        int i = -1;

        for (String name : phonebook) {
            copyPhonebook.put(name, ++i);
        }
    }

    public static void searchHashTable(Hashtable<String, Integer> copyPhonebook, File find) throws FileNotFoundException {
        Scanner scanner = new Scanner(find);
        int countFind = 0;
        int countAll = 0;

        while (scanner.hasNext()) {
            countAll++;
            if (copyPhonebook.get(scanner.nextLine()) != null) {
                countFind++;
            }
        }

        System.out.printf("Found %d / %d entries.", countFind, countAll);
    }
}
