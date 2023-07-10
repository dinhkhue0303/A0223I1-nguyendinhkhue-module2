package ss12.baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name,double price) {
        this.name = name;
        this.id = id;
        this.price=price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return this.id+" "+this.name+" "+this.price;
    }
}

public class ProductManager {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Product> a=new ArrayList<>();
    static {
        a.add(new Product(1,"sua",1500));
        a.add(new Product(2,"keo",1100));
        a.add(new Product(3,"banh",2500));
    }
    int newId;
    String newName;
    double newPrice;
    boolean ktr;
    void add(){
        do{
            ktr=false;
            System.out.println("nhập id:");
            newId=Integer.parseInt(sc.nextLine());
            for (int i = 0; i < a.size(); i++) {
                if(a.get(i).getId()==newId){
                    ktr=true;
                    break;
                }
            }
            if(ktr==true){
                System.out.println("id đã tồn tại xin nhập lại!");
            }
        }while(ktr);
        System.out.println("nhập tên:");
        newName=sc.nextLine();
        do{
            System.out.println("nhập giá:");
            newPrice=Double.parseDouble(sc.nextLine());
            if(newPrice<0){
                System.out.println("???");
            }
        }while(newPrice<0);
        a.add(new Product(newId,newName,newPrice));
    }

    void edit(){
        int kt=0;
        System.out.println("nhập id muốn sửa:");
        newId=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getId()==newId){
                kt++;
                System.out.println("nhập tên:");
                newName=sc.nextLine();
                do{
                    System.out.println("nhập giá:");
                    newPrice=Double.parseDouble(sc.nextLine());
                    if(newPrice<0){
                        System.out.println("???");
                    }
                }while(newPrice<0);
                a.get(i).setName(newName);
                a.get(i).setPrice(newPrice);
                break;
            }
        }
        if(kt==0){
            System.out.println("id không tồn tại!");
        }
    }

    void delete(){
        int kt=0;
        System.out.println("nhập id muốn xóa:");
        newId=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getId()==newId){
                kt++;
                a.remove(i);
                break;
            }
        }
        if (kt == 0) {
            System.out.println("id không tồn tại!");
        }
    }

    void search(){
        int kt=0;
        System.out.println("nhập tên sp muốn tìm:");
        newName=sc.nextLine();
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getName().equals(newName)){
                System.out.println(a.get(i).toString());
                kt++;
            }
        }
        if(kt==0){
            System.out.println("không tìm thấy!!");
        }
    }

    void sapxepTang(){
        Comparator<Product> comparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() > o2.getPrice() ? 1 : -1;
            }
        };
        a.sort(comparator);
    }

    void hienthi(){
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
    public static void main(String[] args) {
        ProductManager p=new ProductManager();
        int choose;
        do{
            System.out.println("1/Thêm sản phẩm\n" +
                    "2/Sửa thông tin sản phẩm theo id\n" +
                    "3/Xoá sản phẩm theo id\n" +
                    "4/Hiển thị danh sách sản phẩm\n" +
                    "5/Tìm kiếm sản phẩm theo tên\n" +
                    "6/Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "nhấn số bất kì khác để thoát menu");
            System.out.println("mời bạn nhập sự lựa chọn:");
            choose=Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    p.add();
                    break;
                case 2:
                    p.edit();
                    break;
                case 3:
                    p.delete();
                    break;
                case 4:
                    p.hienthi();
                    break;
                case 5:
                    p.search();
                    break;
                case 6:
                    p.sapxepTang();
                    break;
            }
        }while(choose > 0 && choose < 7);
    }
}
