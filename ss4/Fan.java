class Fann {
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fann() {
    }

    public Fann(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return this.speed + " " + this.color + " " + this.radius + " fan is on";
        } else {
            return this.speed + " " + this.color + " " + this.radius + " fan is off";
        }
    }
}

public class Fan {
    public static void main(String[] args) {
        Fann f = new Fann(3, true, 10.0, "yellow");
        Fann f1 = new Fann(2, false, 5.0, "blue");
        System.out.println(f.toString());
        System.out.println(f1.toString());
    }
}
