import java.util.*;
//Latika MUKHI 22CSU105

public class DeletionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        System.out.print("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            linkedList.insertAtEnd(element);
        }

        System.out.println("Linked List:");
        linkedList.display();

        while (true){

  System.out.println("Options:");
 System.out.println("1 .Delete from first ");
System.out.println("2.Delete from end ");
    System.out.println("3.Delete from a speific position ");
           
   System.out.println("4. Exit");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

        
switch(option){
case 1:


        linkedList.deleteAtBeginning();
        System.out.println("Linked List after deleting from the beginning:");
        linkedList.display();
        break ;
    case 2:

        linkedList.deleteAtEnd();
        System.out.println("Linked List after deleting from the end:");
        linkedList.display();

        break;
    case 3:

        System.out.print("Enter the position to delete: ");
        int positionToDelete = scanner.nextInt();
        linkedList.deleteAtLocation(positionToDelete);
        System.out.println("Linked List after deleting at position " + positionToDelete + ":");
        linkedList.display();
break;
     case 4:
                    System.out.println("Exiting program.");
               
                    System.exit(0);
                    default:
                    System.out.println("Invalid option. Please enter a valid option.");
    }
}
}}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        head = head.next;
    }
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    public void deleteAtLocation(int position) {
        if (position <= 0 || head == null) {
            System.out.println("Invalid position or list is empty. Cannot delete.");
            return;
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Invalid position. Cannot delete.");
            return;
        }
        current.next = current.next.next;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
