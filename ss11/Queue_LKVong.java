package ss11.baitap;
class Nodeee {
    public int key;
    public Nodeee next;

    public Nodeee(int key) {
        this.key = key;
        this.next = null;
    }
}

public class Queue_LKVong {
    private Nodeee head;
    private Nodeee rear;

    public Queue_LKVong() {
        this.head = null;
        this.rear = null;
    }
    public void enqueue(int key) {
        Nodeee temp = new Nodeee(key);
        if (this.rear == null) {
            this.head = this.rear = temp;
            this.rear.next=this.head;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
        this.rear.next=this.head;
    }
    public Nodeee dequeue() {
        if (this.head == null)
            return null;
        Nodeee temp=this.head;
        if(this.head==this.rear){
            this.head=this.rear=null;
        }else {
            this.head=this.head.next;
            this.rear.next=this.head;
        }
        return temp;
    }
    public void in(){
        Nodeee temp=head;
        while(true){
            System.out.println(temp.key+" ");
            if(temp==rear){
                break;
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Queue_LKVong queue = new Queue_LKVong();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        queue.in();
    }
}
