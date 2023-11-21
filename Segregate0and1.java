import java.util.*;
public class Segregate0and1{
static void print(int arr[], int n)
	{
		System.out.print("Array after segregation is ");
for (int i = 0; i < n; ++i)
System.out.print(arr[i] + " ");}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
 int[] array = new int[size];
 System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();}
int n = array.length;
Arrays.sort(array);
print(array, n);
	}
}
