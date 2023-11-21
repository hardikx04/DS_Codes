import java.util.* ;
public class duplicate_nonduplicate{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int arr[] = new int[5];
for(int i=0; i<5; i++){
arr[i]= sc.nextInt();}
for(int j =0;j<5;j++){
int a=arr[j];
for(int i=0; i<5;i++){
if(a==arr[i]){
System.out.print("WORST CASE ");
break;
}
}
}
}}