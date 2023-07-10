package ss11.baitap;

import java.util.Scanner;
import java.util.EmptyStackException;
import java.util.LinkedList;

class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
public class nhiphan_thapphan {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        MyGenericStack<Integer> stack=new MyGenericStack<>();
        System.out.print("nhập số:");
        int sothapphan=sc.nextInt();
        while(sothapphan!=0){
            stack.push(sothapphan%2);
            sothapphan/=2;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+"");
        }
    }
}