import java.util.Scanner;

public class max_hai_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số dòng:");
        int m = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số cột:");
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
        long max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("max là : " + max);
    }
}
