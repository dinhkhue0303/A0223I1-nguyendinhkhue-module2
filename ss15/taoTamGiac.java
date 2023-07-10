package ss15.baitap;

import java.util.Scanner;
class checkRetangle extends Exception{
    public checkRetangle(String str){
        super(str);
    }
}
public class taoTamGiac {
    static Scanner sc=new Scanner(System.in);
    void canhTamGiac(){
        try{
            System.out.println("nhập cạnh a:");
            double a=Double.parseDouble(sc.nextLine());
            System.out.println("nhập cạnh b:");
            double b=Double.parseDouble(sc.nextLine());
            System.out.println("nhập cạnh c:");
            double c=Double.parseDouble(sc.nextLine());
            try{
                IllegalTriangleException(a,b,c);
            }catch (checkRetangle e){
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println("nhập không đúng định dạng");
        }
    }
    void IllegalTriangleException(double a, double b, double c)throws checkRetangle{
        if(a+b<=c || a+c<=b || c+b<=a){
            throw new checkRetangle("Tam giac khong hop le");
        }else{
            System.out.println("Tam giac hop le!");
        }
    }
    public static void main(String[] args) {
        taoTamGiac i=new taoTamGiac();
        i.canhTamGiac();
    }
}
