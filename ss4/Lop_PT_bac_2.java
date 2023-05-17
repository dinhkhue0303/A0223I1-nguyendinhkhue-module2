import java.util.Scanner;

class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.b * this.b - 4 * this.a * this.c)) / (2 * this.a);
    }
}

public class Lop_PT_bac_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a:");
        double a = Integer.parseInt(sc.nextLine());
        System.out.println("nhập b:");
        double b = Integer.parseInt(sc.nextLine());
        System.out.println("nhập c:");
        double c = Integer.parseInt(sc.nextLine());
        QuadraticEquation quad = new QuadraticEquation(a, b, c);
        System.out.println("phương trình:");
        System.out.printf("%fx^2+%fx+%f=0", a, b, c);
        System.out.println();
        System.out.println("delta = " + quad.getDiscriminant());
        if (quad.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (quad.getDiscriminant() == 0) {
            System.out.println("getRoot = " + quad.getRoot1());
        } else if (quad.getDiscriminant() > 0) {
            System.out.println("getRoot1 = " + quad.getRoot1());
            System.out.println("getRoot2 = " + quad.getRoot2());
        }
    }
}
