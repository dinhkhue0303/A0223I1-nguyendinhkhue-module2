import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {0, 1, 2, 3, 4, 5};
        int n = array.length;
        System.out.print("nhập giá trị cần xoá:");
        int value = Integer.parseInt(sc.nextLine());
        int ktr = 0;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                ktr++;
                break;
            }
        }
        if (ktr == 0) {
            System.out.println("không có phần tử đó trong mảng");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    for (int j = i; j < array.length - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    n--;
                    break;
                }
            }
        }
        System.out.println("xuất mảng");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
