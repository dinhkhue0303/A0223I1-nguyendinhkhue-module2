import java.util.Scanner;

class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}

interface Resizeable{
    void resize(double percent);
}

class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setLength(this.getLength()+this.getLength()*percent);
        this.setWidth(this.getWidth()+this.getWidth()*percent);
    }
}

class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius()+this.getRadius()*percent);
    }
}

class Square extends Shape implements Resizeable{
    private double side=1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return this.side*this.side;
    }

    public double getPerimeter(){
        return this.side*4;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setSide(this.getSide()+this.getSide()*percent);
    }
}
public class interface_Resizeable {
    public static void main(String[] args) {
        Shape shape = new Shape("red", false);
        System.out.println(shape);

        Rectangle rectangle = new Rectangle(2, 4, "orange", true);
        System.out.println(rectangle);

        Circle circle = new Circle(3, "indigo", false);
        System.out.println(circle);

        Square square = new Square(2,"red",false);
        System.out.println(square);

        System.out.println();

        Shape[] shapes=new Shape[3];
        shapes[0]=rectangle;
        shapes[1]=circle;
        shapes[2]=square;

        for(int i=0;i<shapes.length;i++){
            if(shapes[i] instanceof Rectangle){
                Rectangle list=(Rectangle) shapes[i];
                double random=(Math.round((Math.random()*100)))/100.0;
                System.out.println(random);
                list.resize(random);
                System.out.println(list);
            }else if(shapes[i] instanceof Circle){
                Circle list=(Circle) shapes[i];
                double random=Math.round((Math.random()*100));
                random=random/100;
                list.resize(random);
                System.out.println(list);
            }else if(shapes[i] instanceof Square){
                Square list=(Square) shapes[i];
                double random=Math.round((Math.random()*100));
                random=random/100;
                list.resize(random);
                System.out.println(list);
            }
        }
    }
}
