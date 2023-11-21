import java.util.*;

public class SecondLargest{
   public static void main(String args[]){
      int temp, size,i;
      int[] arr = new int[5];
      Scanner s = new Scanner(System.in);
       System.out.print("Enter 5 Elements: ");
      for(i=0; i<5; i++)
         arr[i] = s.nextInt();

      size = arr.length;

      for(i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){

            if(arr[i]>arr[j]){
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
      System.out.println(" second largest number is: "+arr[size-2]);
   }
}