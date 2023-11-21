import java.util.* ;
public class integer_arr{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[][],n ;
System.out.print("enter value for n:  ");
    n = sc.nextInt();
    arr = new int[n][n];
System.out.println("enter elements of array:    ");
    for(int i=0; i<n; i++){
    	for(int j=0; j<n;j++){
    	arr[i][j]= sc.nextInt();}}
    	for(int i=0; i<n;i++){
    	for(int j =0; j<n;j++){
    	if(arr[i][j]%2 != 0){
    	arr[i][j] = arr[i][j]*2;}
System.out.print( arr[i][j]+"\t");}
System.out.print("\n");}
}}
