import java.lang.*;

class DLL{

    public static void main(String args[])
    {
        DoublyLinkedList doublylist = new DoublyLinkedList();

        doublylist.insertBeginning(3);
        doublylist.insertBeginning(2);
        doublylist.insertBeginning(1);

        doublylist.printList();

        doublylist.insertEnd(4);
        doublylist.insertEnd(6);
        doublylist.insertEnd(7);
        doublylist.insertEnd(8);

        doublylist.printList();


        doublylist.insertAfterPosition(4,5);

        doublylist.printList();
    }
}

class DoublyLinkedList {
    Node head;
 
    class Node {
        int data;
        Node next, prev;

        Node(int x) 
        {
            data = x;
            next = null;
            prev = null;
        }
    }

    public void insertBeginning(int data) {

        Node freshNode = new Node(data);

        freshNode.next = head;
        freshNode.prev = null;

  
        if (head != null)
            head.prev = freshNode;


        head = freshNode;
    }

    public void insertEnd(int data) {
    
        Node freshNode = new Node(data);

        freshNode.next = null;


        if (head == null) {
            head = freshNode;
            freshNode.prev = null;
            return;
        }

        Node last = head;

        while (last.next != null)
            last = last.next;


        last.next = freshNode;
        freshNode.prev = last;

    }

    public void insertAfterPosition(int n, int data) {
        int len = getLength(head);

        if (n == 0) {
            insertBeginning(data);
            return;
        }
     
        if (n == len) {
            insertEnd(data);
            return;
        }


        if (n < 1 || len < n) System.out.println("Invalid position");
        else { Node freshNode = new Node(data);

            freshNode.next = null;

            freshNode.prev = null;
   

            Node nthNode = head;


            while (--n > 0) {
            nthNode = nthNode.next;
        }

        Node nextNode = nthNode.next;

        nextNode.prev = freshNode;

      
        freshNode.next = nextNode;
        freshNode.prev = nthNode;

   
        nthNode.next = freshNode;
    }
}

    public void printList() {
        Node node = head;
        Node end = null;
      

        System.out.print("\nforward: ");
        while (node != null) {
            System.out.print(node.data + " ");
            end = node;
            node = node.next;
        }
        System.out.print("\nBackward: ");

        while (end != null) {
            System.out.print(end.data + " ");
            end = end.prev;
        }
        System.out.println();
    }

    public int getLength(Node node) {
        int size = 0;
      
        while (node != null) {
            node = node.next;
            size++;
        }
        return size;
    }

}