package phonebook;

import java.util.List;

public class QuickSort {

    public static void doQuickSort(List<String> copyPhonebook) {
        quickSort(copyPhonebook, 0, copyPhonebook.size() - 1);
    }

    public static void swap(List<String> copyPhonebook, int i, int j) {
        String temp = copyPhonebook.get(i);
        copyPhonebook.set(i, copyPhonebook.get(j));
        copyPhonebook.set(j, temp);
    }

    public static int partition(List<String> copyPhonebook, int start, int end) {
        String pivot = copyPhonebook.get(end);
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (copyPhonebook.get(j).compareTo(pivot) <= 0) {
                swap(copyPhonebook, ++i, j);
            }
        }
        swap(copyPhonebook, i + 1, end);

        return i + 1;
    }

    public static void quickSort(List<String> copyPhonebook, int start, int end) {
        if (start < end) {
            int pivot = partition(copyPhonebook, start, end);

            quickSort(copyPhonebook, start, pivot - 1);
            quickSort(copyPhonebook, pivot + 1, end);
        }
    }
}
