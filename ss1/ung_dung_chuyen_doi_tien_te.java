import java.util.Scanner;

public class ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập USD:");
        double USD = Integer.parseInt(sc.nextLine());
        double VND = USD * 23000;
        System.out.println("VND : " + VND);
    }
}
