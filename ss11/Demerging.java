package ss11.baitap;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

class Person{
    private String hoTen;
    private String gioiTinh;
    private int ngaySinh;

    public Person(){};

    public Person(String hoTen, String gioiTinh, int ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String toString(){
        return hoTen+" "+gioiTinh+" "+ngaySinh;
    }
}
class node {
    public Person key;
    public node next;

    public node(Person key) {
        this.key = key;
        this.next = null;
    }
}
class Queuee<T> {
    private node head;
    private node tail;

    public Queuee() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(Person key) {
        node temp = new node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Person dequeue() {
        if (this.head == null)
            return null;
        node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp.key;
    }

    public boolean isEmpty(){
        node temp=head;
        if(temp==null){
            return true;
        }
        return false;
    }
}
public class Demerging {
    public static void main(String[] args) {
        Queuee<Person> queueeNu=new Queuee<>();
        Queuee<Person> queueeNam=new Queuee<>();
        Person p=new Person("kha","nam",20);
        Person p3=new Person("hoa","nữ",21);
        Person p1=new Person("khang","nam",22);
        Person p2=new Person("lan","nữ",23);
        Person[] personLists={p,p3,p1,p2};
        for (int i = 0; i < personLists.length; i++) {
            if(personLists[i].isGioiTinh()=="nữ"){
                queueeNu.enqueue(personLists[i]);
            }else{
                queueeNam.enqueue(personLists[i]);
            }
        }
        while (!queueeNu.isEmpty()){
            System.out.println(queueeNu.dequeue());
        }
        while (!queueeNam.isEmpty()){
            System.out.println(queueeNam.dequeue());
        }
    }
}
