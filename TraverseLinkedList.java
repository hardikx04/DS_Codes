import java.util.LinkedList;
import java.util.ListIterator;
/*
	This program demonstrate the usage of LinkedList class
*/
public class TraverseLinkedList{
public static void main(String[] args)
{
	LinkedList<String> staff = new LinkedList<>();
	staff.addLast("Diana");
	staff.addLast("Harry");
	staff.addLast("Romeo");
	staff.addLast("Tom");
	ListIterator<String> iterator = staff.listIterator();
	iterator.next();
	iterator.next();
	//add more elements after the second element
	iterator.add("Juliet");
	iterator.add("Nina");

iterator.next();
	//Remove last traversed element
	iterator.remove();
	//Print all elements
	System.out.println(staff);
}}
