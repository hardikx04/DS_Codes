import java.util.*;

public class EvenIndex{

   
   public static void main(String[] args){

   Scanner scanner = new Scanner(System.in);

 System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
 int[] array = new int[size];
 System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();}
 
      System.out.println("Even position of elements present in an array are: ");
  
      for (int i = 2; i < array.length; i = i+2){  
         System.out.print(array[i]+" ");  
      }  
   }
}