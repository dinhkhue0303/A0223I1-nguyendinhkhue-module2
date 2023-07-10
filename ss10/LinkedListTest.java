package ss10.baitap;
class Node{
    Node next;
    Object data;
    Node(Object data){
        this.data=data;
    }
    Object getData(){
        return this.data;
    }
}
public class LinkedListTest <E>{
    Node head;
    int numNode;
    LinkedListTest(){
        head=new Node(2);
    }
    void add(int index,Object data){
        Node temp=head;
        Node holder;
        if(index==0){
            head=new Node(data);
            head.next=temp;
        }else{
            for (int i = 0; i < index-1 && temp.next!=null; i++) {
                temp=temp.next;
            }
            holder=temp.next;
            temp.next=new Node(data);
            temp.next.next=holder;
            numNode++;
        }
    }

    void addFirst(Object data){
        Node temp=head;
        head=new Node(data);
        head.next=temp;
        numNode++;
    }

    void addLast(Object data){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data);
        temp.next.next=null;
    }

    E removeIndex(int index){
        Node temp=head;
        Node holder;
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }
        holder=temp.next;
        temp.next=holder.next;
        return (E) holder.data;
    }

    E removeNode(Object data){
        Node temp=head;
        Node holder;
        if(temp.data==data){
            head=temp.next;
            return (E) temp.data;
        }
        while(temp.next!=null && temp.next.data!=data){
            temp=temp.next;
        }
        if(temp.next!=null && temp.next.data==data){
            holder=temp.next;
            temp.next=holder.next;
            return (E) holder.data;
        }
        return null;
    }

    int size(){
        Node temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }



    boolean contains(Object data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    int indexOf(Object data){
        Node temp=head;
        int index=0;
        while(temp!=null){
            if(temp.data==data){
                return index;
            }
            temp=temp.next;
            index++;
        }
        return -1;
    }

    E get(int index){
        Node temp=head;
        int vitri=0;
        while(temp!=null){
            if(vitri==index){
                return (E) temp.data;
            }
            temp=temp.next;
            vitri++;
        }
        return null;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp);
    }



    public static void main(String[] args) {
        LinkedListTest <Integer>l=new LinkedListTest<>();
        l.add(0,3);
        l.addFirst(4);
        l.addLast(10);
        l.printList();
        System.out.println(l.removeIndex(2));
        l.printList();
        System.out.println(l.removeNode(2));
        l.printList();
        System.out.println(l.size());
        System.out.println(l.contains(2));
        System.out.println(l.indexOf(4));
//        System.out.println(l.get(1));
    }
}
