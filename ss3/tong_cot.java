import java.util.Scanner;

public class tong_cot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập hàng:");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("nhập cột:");
        int n = Integer.parseInt(sc.nextLine());
        long[][] a = new long[m][n];
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
        System.out.println("tính tổng cột thứ :");
        int k = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == k) {
                    tong += a[i][j];
                }
            }
        }
        System.out.printf("tổng cột thứ %d là %d", k, tong);
    }
}
