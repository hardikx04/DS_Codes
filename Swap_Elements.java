import java.util.*;

public class SwapElements{ 
 public static void main(String[] args) {     
    Scanner scanner = new Scanner(System.in);  
    System.out.println("Enter the size of the array: ");  
    int size = scanner.nextInt();     
    int A[] = new int[size];    
    System.out.println("Enter the elements of the array: "); 

    readArray(A, scanner);   
    swapPairs(A); 
    System.out.println("After swapping the adjacent elements: "); 
     printArray(A);
                         } 
    public static void readArray(int[] A, Scanner scanner)
                         {    
    for (int i = 0; i < A.length; i++){       
        A[i] = scanner.nextInt();  
          } 
         }  
  public static void swapPairs(int[] A)
   {     int size = A.length, size2 = 0;   
     if (size % 2 == 1)
      {       size2 = size - 1;   
        } else       size2 = size;  
            for (int i = 0; i < size2; i += 2)
             {       int temp = A[i];   
                 A[i] = A[i + 1];   
                     A[i + 1] = temp;
           }   } 
             public static void printArray(int[] A) 
             {     for (int i = 0; i < A.length; i++) 


             {       System.out.print(A[i] + " ");     }   } }