import java.util.* ;
public class equalityofarrays{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int arr[],arr2[],n ;
    System.out.print("enter value for n:  ");
    n = sc.nextInt();
    arr = new int[n];
    arr2 = new int[n];
    System.out.println("enter elements of array:    ");
    for(int i=0; i<n; i++){
        arr[i]= sc.nextInt();
    }
    System.out.println("enter elements of array2:    ");
    for(int i=0; i<n; i++){
        arr2[i]= sc.nextInt();
    }
    for(int i=0; i<n; i++){
        if(arr[i] == arr2[i]){
            System.out.print("equal arrays");
            break;}
            else{
                System.out.print("non equal arrays");
        }
}
}}