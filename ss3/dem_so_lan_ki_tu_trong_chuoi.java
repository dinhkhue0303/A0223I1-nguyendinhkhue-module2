import java.util.Scanner;

public class dem_so_lan_ki_tu_trong_chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abaabc";
        System.out.println("chuỗi : " + str);
        System.out.print("nhập kí tự:");
        char c = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        System.out.println("số lần xuất hiện kí tự là : " + count);
    }
}
