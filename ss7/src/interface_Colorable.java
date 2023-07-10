import java.util.Scanner;

class Shapee {
    private String color = "green";
    private boolean filled = true;

    public Shapee() {
    }

    public Shapee(String color, boolean filled) {
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

interface Colorable {
    void howToColor();
}

class Rectanglee extends Shapee {
    private double width = 1.0;
    private double length = 1.0;

    public Rectanglee() {
    }

    public Rectanglee(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectanglee(double width, double length, String color, boolean filled) {
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
}

class Circlee extends Shapee {
    private double radius = 1.0;

    public Circlee() {
    }

    public Circlee(double radius) {
        this.radius = radius;
    }

    public Circlee(double radius, String color, boolean filled) {
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
}

class Squaree extends Shapee implements Colorable {
    private double side=1.0;

    public Squaree() {
    }

    public Squaree(double side) {
        this.side = side;
    }

    public Squaree(double side, String color, boolean filled) {
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
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
public class interface_Colorable {
    public static void main(String[] args) {
        Shapee shape = new Shapee("red", false);
        System.out.println(shape);

        Rectanglee rectangle = new Rectanglee(2, 4, "orange", true);
        System.out.println(rectangle);

        Circlee circle = new Circlee(3, "indigo", false);
        System.out.println(circle);

        Squaree square = new Squaree(2,"red",false);
        System.out.println(square);

        System.out.println();

        Shapee[] shapes=new Shapee[3];
        shapes[0]=rectangle;
        shapes[1]=circle;
        shapes[2]=square;

        for(int i=0;i<shapes.length;i++){
            if(shapes[i] instanceof Colorable){
                ((Colorable) shapes[i]).howToColor();
            }else{
                if(shapes[i] instanceof Rectanglee){
                    System.out.println("Area of Rec : "+((Rectanglee) shapes[i]).getArea());
                }else if(shapes[i] instanceof Circlee){
                    System.out.println("Area of Cir : "+((Circlee) shapes[i]).getArea());
                }else if(shapes[i] instanceof Squaree){
                    System.out.println("Area of Squa : "+((Squaree) shapes[i]).getArea());
                }
            }
        }
    }
}
