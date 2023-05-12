import java.util.Scanner;

public class tong_duong_cheo_chinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào một ma trận vuông");
        System.out.println("nhập hàng:");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("nhập cột:");
        int n = Integer.parseInt(sc.nextLine());
        double[][] a = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.round(Math.random() * 100);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i][i];
        }
        System.out.printf("tổng đường chéo là %d", tong);
    }
}
