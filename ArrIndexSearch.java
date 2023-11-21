import java.util.*;
public class ArrIndexSearch{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[]arr = new int[10];
	System.out.println("Enter 10 integers");
	for(int i =0;i <10; i++){
	arr[i]=sc.nextInt();
	}
	System.out.println("Enter the number to be search");
	int SNum = sc.nextInt();
	//System.out.print("Array Elements:");
	//for (int i=0;i<10;i++ ){
	//System.out.print(arr[i] + "");
	//}
	System.out.println();
	int ind = -1;
	for(int i=0; i<10;i++){
	if (arr[i]==SNum){
	ind = i;
	break;
	}
	}
System.out.println("Index of" + SNum +":" + ind);

	}
}