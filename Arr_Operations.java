import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        int sumOfAll = 0;
        for (int num : array) {
            sumOfAll += num;
        }
        System.out.println("Sum of all elements: " + sumOfAll);

        
        int sumOfAlternate = 0;
        for (int i = 0; i < 5; i += 2) {
            sumOfAlternate += array[i];
        }
        System.out.println("Sum of alternate elements: " + sumOfAlternate);
        Arrays.sort(array);
        int secondHighest = array[3]; // Since array is now sorted in ascending order
        System.out.println("Second highest element: " + secondHighest);
    }
}
