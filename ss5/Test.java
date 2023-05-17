class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
    }
}


