import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedIterator{
    public static void main(String args[])
    {
    LinkedList<String> staff = new LinkedList<>();
ListIterator<String> iterator = staff.listIterator();
iterator.add("the");
iterator.add("northcap");
iterator.add("university");
iterator = staff.listIterator();
if(iterator.next().equals("Tom"))
{
    iterator.remove();
}
while(iterator.hasNext()){
    System.out.println(iterator.next());
}
}
}