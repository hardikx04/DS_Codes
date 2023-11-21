import java.util.Scanner;

public class FirstAndLast{
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

 System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
 int[] array = new int[size];
 System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
 }
 System.out.println("First element of array : "+array[0]);
 System.out.println("Last element of array : "+array[size - 1]);
}
}