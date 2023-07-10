class Point{
    float x=0.0f;
    float y=0.0f;
    Point(){}
    Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        float[] newArray={this.x,this.y};
        return newArray;
    }

    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
}

class MovablePoint extends Point{
    float xSpeed=0.0f;
    float ySpeed=0.0f;

    public MovablePoint(){}

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] newArray={this.xSpeed,this.ySpeed};
        return newArray;
    }

    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString(){
        return "("+super.x+","+super.y+",speed("+this.xSpeed+","+this.ySpeed+")";
    }

    public MovablePoint move(){
        super.x+=this.xSpeed;
        super.y+=this.ySpeed;
        return this;
    }
}
public class Point_MoveablePoint {
    public static void main(String[] args) {
        Point p=new Point(1,2);
        MovablePoint m=new MovablePoint(3,4,5,6);
        System.out.println(p.toString());
        System.out.println(m.toString());
        System.out.println(m.move());
        System.out.println();
        MovablePoint m1=new MovablePoint(5,6);
        System.out.println(m1.toString());
        System.out.println(m1.move());
    }
}
