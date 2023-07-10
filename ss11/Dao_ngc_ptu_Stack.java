package ss11.baitap;

import java.util.Arrays;
import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList();
    }

    void push(T e) {
        stack.addFirst(e);
    }

    T pop() {
        if (stack.isEmpty()) {
            System.out.println("mang rong");
        }
        return stack.removeFirst();
    }

    int size() {
        return stack.size();
    }

    boolean isEmty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}

public class Dao_ngc_ptu_Stack<T> {

    private static void DaoChuoi() {
        Stack<String> stack = new Stack();
        String mangChuoi = "hello";
        System.out.println("chuỗi ban đầu : " + mangChuoi);
        String[] newChuoi = mangChuoi.split("");
        for (int i = 0; i < newChuoi.length; i++) {
            stack.push(newChuoi[i]);
        }
        for (int i = 0; i < newChuoi.length; i++) {
            newChuoi[i] = stack.pop();
        }
        System.out.print("chuỗi sau khi đảo : ");
        for (int i = 0; i < newChuoi.length; i++) {
            System.out.print(newChuoi[i] + "");
        }
    }

    private static void DaoSoNguyen() {
        Stack<Integer> stack = new Stack();
        int[] mangSoNguyen = {1, 2, 3, 4, 5, 6};
        System.out.println("mảng số ban đầu : " + Arrays.toString(mangSoNguyen));
        for (int i = 0; i < mangSoNguyen.length; i++) {
            stack.push(mangSoNguyen[i]);
        }
        for (int i = 0; i < mangSoNguyen.length; i++) {
            mangSoNguyen[i] = stack.pop();
        }
        System.out.println("mảng số sau khi đổi : " + Arrays.toString(mangSoNguyen));
    }

    public static void main(String[] args) {
        DaoChuoi();
        System.out.println();
        System.out.println("=============");
        DaoSoNguyen();
    }
}
