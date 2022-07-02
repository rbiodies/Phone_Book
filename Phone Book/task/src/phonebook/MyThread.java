package phonebook;

import java.util.List;

import static phonebook.BubbleSort.bubbleSort;

public class MyThread extends Thread {

    private final List<String> copyPhonebook;
    private boolean flag = false;

    public MyThread(List<String> copyPhonebook) {
        this.copyPhonebook = copyPhonebook;
    }

    public void run() {
        bubbleSort(copyPhonebook);
        flag = true;
    }

    public boolean isSorted() {
        return flag;
    }
}
