public class Sum{
public static void main(String args[]){
int[] num = new int[5];
num[0]=6;
num[1]=5;
num[2]=7;
num[3]=9;
num[4]=2;

int s=0;
for (int i:num){
s+=i;
}
System.out.println(s);
}}
