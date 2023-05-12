import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1/Print the rectangle\n" +
                "\n" +
                "2/Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "\n" +
                "3/Print isosceles triangle\n" +
                "\n" +
                "4/Exit");
        do {
            System.out.print("nhập sự lựa chọn:");
            int n = Integer.parseInt(sc.nextLine());
            if (n == 4) {
                System.out.println("thoát chương trình!!");
                break;
            }
            switch (n) {
                case 1: {
                    System.out.println("* * * * * * *\n" +
                            "* * * * * * *\n" +
                            "* * * * * * *");
                    break;
                }
                case 2: {
                    System.out.println("*\n" +
                            "* *\n" +
                            "* * *\n" +
                            "* * * *\n" +
                            "* * * * *");
                    break;
                }
                case 3: {
                    System.out.println("* * * * *                             \n" +
                            "* * * *                                   \n" +
                            "* * *                                         \n" +
                            "* *                                               \n" +
                            "*        ");
                    break;
                }
                default:
                    System.out.println("nhập lại");
            }
        } while (true);
    }
}
