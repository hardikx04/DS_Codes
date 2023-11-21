import java.util.Arrays;
import java.util.Scanner;

public class InsertArrElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        
        int[] arr = new int[size];

        
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       
        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();

     
        System.out.print("Enter the position to insert the element (0-based): ");
        int position = scanner.nextInt();

        
        if (position < 0 || position > size) {
            System.out.println("Invalid position. Element cannot be inserted.");
        } else {
           
            int[] newArr = new int[size + 1];

            
            for (int i = 0; i < position; i++) {
                newArr[i] = arr[i];
            }

           
            newArr[position] = elementToInsert;

           
            for (int i = position; i < size; i++) {
                newArr[i + 1] = arr[i];
            }

            System.out.println("Array after inserting element:");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        }

    }
}