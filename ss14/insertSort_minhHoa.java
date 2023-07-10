package ss14.baitap;

import java.util.Arrays;

public class insertSort_minhHoa {
    public void insertionSort(int[] array) {
        int pos, x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                System.out.println("Swap " + x + " with " + array[pos - 1]);
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;

            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        insertSort_minhHoa i = new insertSort_minhHoa();
        int[] array = {8, 9, 5, 7, 6, 3, 2, 5, 6, 4, 7};
        i.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}