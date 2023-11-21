import java.util.Arrays;
import java.util.Scanner;

public class RemoveArrayElement {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.print("Enter the size of the array: ");

int size = scanner.nextInt();
int[] arr = new int[size];
System.out.println("Enter array elements:");
for (int i = 0; i < size; i++) {
arr[i] = scanner.nextInt();
        }

System.out.print("Enter the element to remove: ");
int elementToRemove = scanner.nextInt();

int indexToRemove = -1;
for (int i = 0; i < size; i++) {
if (arr[i] == elementToRemove) {
 indexToRemove = i;
 break;
            }
        }

if (indexToRemove != -1) {
for (int i = indexToRemove; i < size - 1; i++) {
arr[i] = arr[i + 1];
 }
 size--; 

 int[] newArr = Arrays.copyOf(arr, size);

System.out.println("Array after removing element:");
 for (int num : newArr) {
System.out.print(num + " ");
            }
        } 
else {
System.out.println("Element not found in the array.");
        }

       
    }
}