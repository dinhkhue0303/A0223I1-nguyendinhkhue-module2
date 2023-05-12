public class gop_mang {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 4, 1000};
        int[] b = {5, 6, 7, 8, 9};
        int length = a.length + b.length;
        int[] c = new int[length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
