

class Point2D{
    float x=0.0f;
    float y=0.0f;
    Point2D(){}
    Point2D(float x,float y){
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

class Point3D extends Point2D{
    float z=0.0f;
    Point3D(){}
    Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public float[] getXYZ(){
        float[] newArray={this.x,this.y,this.z};
        return newArray;
    }

    @Override
    public String toString(){
        return "("+this.x+","+this.y+","+this.z+")";
    }
}
public class point2D_point3D {
    public static void main(String[] args) {
        Point2D p=new Point2D(1,2);
        Point3D p1=new Point3D(6,8,3);
        System.out.println(p.toString());
        System.out.println(p1.toString());
    }
}
