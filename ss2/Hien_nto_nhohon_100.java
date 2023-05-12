public class Hien_nto_nhohon_100 {
    public static void main(String[] args) {
        for (int i = 2; i > 0; i++) {
            int ktr = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    ktr++;
                    break;
                }
            }
            if (ktr == 0) {
                System.out.print(i + " ");
            }
            if (i >= 100) {
                break;
            }
        }
    }
}
