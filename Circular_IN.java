import java.lang.*;

public class Circular_IN{
    public static void main(String[] args) {
        Circular_IN Obj = new Circular_IN();
        Obj.insertBegin(11);
        Obj.insertBegin(22);
        Obj.insertEnd(33);
        Obj.insertEnd(44);
        Obj.insertAfter(3,77);
        Obj.print();
    }
    public class Node{
        int element;
        Node next;
        public Node(int element) {
            this.element = element;
        }
    }

    public Node head = null;
    public Node tail = null;
    int size=0;

    public void insertBegin(int element){
        Node newEle = new Node(element);
        if(head == null) {
            head = newEle;
            tail = newEle;
            newEle.next = head;
        }
        else {
             newEle.next=head;
             head=newEle;
             tail.next = head;
        }
        size++;
    }

    public void insertEnd(int element){
        Node newEle = new Node(element);
        if(head == null) {
            head = newEle;
            tail = newEle;
            newEle.next = head;
        }
        else {
            tail.next=newEle;
            newEle.next=head;
            tail=newEle;
        }
        size++;
    }

    public void insertAfter(int n,int data)
    {
        int size = calcSize(head);

        if(n < 1 || n > size)
        {
            System.out.println("Can't insert\n");

        }
        else
        {
            Node newNode = new Node(data);

            Node temp = head;

            while(--n > 1)
                temp=temp.next;

            newNode.next= temp.next;
            temp.next = newNode;
        }
    }
    public int calcSize(Node node){
        int size = 0;
        while(node!=tail){
            node = node.next;
            size++;
        }
        return size+1;
    }



    public void print() {  
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
            do{
                System.out.print(" "+ current.element);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }
}