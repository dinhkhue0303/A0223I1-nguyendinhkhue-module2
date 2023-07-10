package ss11.baitap;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Scanner;

class Nodee {
    public String key;
    public Nodee next;

    public Nodee(String key) {
        this.key = key;
        this.next = null;
    }
}

class Queue {
    private Nodee head;
    private Nodee tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void enqueue(String key) {
        Nodee temp = new Nodee(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Nodee dequeue() {
        if (this.head == null)
            return null;
        Nodee temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}

class MyGenericStackk<T> {
    private LinkedList<T> stack;

    public MyGenericStackk() {
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


public class Palindrome {
    static Scanner sc = new Scanner((System.in));

    public static void main(String[] args) {
        Queue queue = new Queue();
        MyGenericStackk<String> stack = new MyGenericStackk();
        System.out.print("nhập chuỗi :");
        String chuoi = sc.nextLine();
        String[] newChuoi = chuoi.split("");
        for (int i = 0; i < newChuoi.length; i++) {
            stack.push(newChuoi[i]);
            queue.enqueue(newChuoi[i]);
        }
        int ktr = 0;
        for (int i = 0; i < newChuoi.length; i++) {
            if (!(stack.pop()).equals(queue.dequeue().key)) {
                ktr++;
                break;
            }
        }
        if (ktr == 0) {
            System.out.println("chuỗi Palindrome ");
        } else {
            System.out.println("Không phải chuỗi Palindrome ");
        }
    }
}
