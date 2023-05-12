public class Hien_20_nto_dau_tien {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i > 0; i++) {
            int ktr = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    ktr++;
                    break;
                }
            }
            if (ktr == 0) {
                count++;
                System.out.print(i + " ");
            }
            if (count == 20) {
                break;
            }
        }
    }
}
