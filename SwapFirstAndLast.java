import java.util.Scanner;

public class SwapFirstAndLast{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
 int[] array = new int[size];
 System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        if (size > 0) {
            int temp = array[0];
   array[0] = array[size - 1];
  array[size - 1] = temp;
        }

        
        System.out.println("Array after swapping first and last elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }

    
    }
}
