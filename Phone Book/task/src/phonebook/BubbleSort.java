package phonebook;

import java.util.List;

import static phonebook.Main.totalMs;

public class BubbleSort {
    static MyThread sortThread;

    public static void doBubbleSort(List<String> copyPhonebook) throws InterruptedException {
        sortThread = new MyThread(copyPhonebook);

        sortThread.start();

        long startTime = System.currentTimeMillis();
        long currentTime = System.currentTimeMillis();

        while (currentTime - startTime < totalMs * 10 && !sortThread.isSorted()) {
            currentTime = System.currentTimeMillis();
        }
        if (sortThread.isSorted()) {
            sortThread.join();
        } else {
            sortThread.stop();
        }
    }

    // An optimized version of Bubble Sort
    public static void bubbleSort(List<String> copyPhonebook) {
        boolean swapped;
        for (int i = 0; i < copyPhonebook.size() - 1; i++) {
            swapped = false;
            for (int j = 0; j < copyPhonebook.size() - i - 1; j++) {
                if (copyPhonebook.get(j).compareTo(copyPhonebook.get(j + 1)) > 0) {
                    // swap copyPhonebook.get(j) and copyPhonebook.get(j + 1)
                    String temp = copyPhonebook.get(j);
                    copyPhonebook.set(j, copyPhonebook.get(j + 1));
                    copyPhonebook.set(j + 1, temp);
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }
}
