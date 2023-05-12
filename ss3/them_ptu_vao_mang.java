import java.util.Scanner;

public class them_ptu_vao_mang {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá trị chèn:");
        int value = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vị trí chèn:");
        int index = Integer.parseInt(sc.nextLine());
        int[] newa = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            newa[i] = a[i];
        }
        newa[newa.length - 1] = 0;
        for (int i = newa.length - 1; i > index; i--) {
            newa[i] = newa[i - 1];
        }
        newa[index] = value;
        for (int i = 0; i < newa.length; i++) {
            System.out.print(newa[i] + " ");
        }
    }
}
