package ss14.baitap;

import java.util.Arrays;

public class insertSort {
    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 9, 5, 7, 6, 3, 2, 5, 6, 4, 7};
        insertSort.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
