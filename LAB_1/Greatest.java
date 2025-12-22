import java.util.Scanner;
class Greatest{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter the first number:");
int a = input.nextInt();
System.out.print("Enter the Second number:");
int b = input.nextInt();
System.out.print("Enter the third number:");
int c = input.nextInt();

if (a>b && a>c){
System.out.println(a+" is the greatest of given three numbers.");
}
else if (b>a && b>c){
System.out.println(b+" is the greatest of given three numbers.");
}
else{
System.out.println(c+" is the greatest of given three numbers.");
}
}}

