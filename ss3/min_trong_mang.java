public class min_trong_mang {
    public static void main(String[] args) {
        int[] a = {12, 3, 0, 5, 6, 45, 4};
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("min là : " + min);
    }
}
