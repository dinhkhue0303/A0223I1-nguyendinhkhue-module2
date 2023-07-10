package ss13;

import java.util.Scanner;

public class De_quy_nhi_phan {
    public static void main(String[] args) {
        De_quy_nhi_phan d = new De_quy_nhi_phan();
        Scanner sc = new Scanner((System.in));
        int[] a = {1, 2, 5, 6, 8, 9, 11, 15, 20};
        System.out.println("nhap gia tri can tim:");
        int value = Integer.parseInt(sc.nextLine());
        System.out.println(d.binarySearch(a, value, 0, a.length - 1));
    }

    int binarySearch(int[] a, int value, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == value) {
                return mid;
            }
            if (a[mid] < value) {
                return binarySearch(a, value, mid + 1, right);
            }
            return binarySearch(a, value, left, mid - 1);
        }
        return -1;
    }

}
