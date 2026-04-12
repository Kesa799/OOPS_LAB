import java.util.Arrays;
public class Array{
public static void main(String args[]){
int[] arr = new int[5];
arr[0]=5;
arr[1]=9;
arr[2]=8;
arr[3]=6;
arr[4]=7;

Arrays.sort(arr);
for (int i:arr){
System.out.println(i +" ");
}
}}