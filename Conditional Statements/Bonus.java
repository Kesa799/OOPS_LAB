import java.util.Scanner;
public class Bonus{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter your name: ");
String name=input.nextLine();
System.out.print("Enter your salary: ");
double salary= input.nextDouble();
System.out.print("Enter your years of experience: ");
int year = input.nextInt();
System.out.print("Enter your department: ");
input.nextLine();
String dep=input.nextLine();
double bonus = 0.0;
if (year >= 2 && year <= 5){
bonus = 0.10 * salary;
}else if (year > 5 && year <= 10){
bonus = 0.20 * salary;
}else if (year > 10){
bonus = 0.35 * salary;
}
if (dep.equalsIgnoreCase("Hazardous")){
bonus += 5000.0;
}
System.out.println("\nBONUS AMOUNT: " + bonus);
}
}