import java.util.Scanner;
class StudentInfo{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("\t\t\tBASIC STUDENT INFO");
System.out.print("Enter your name:");
String name = input.nextLine();
System.out.print("Enter your roll number:");
String rno = input.nextLine();
System.out.print("Enter the Semester number:");
int sem = input.nextInt();
System.out.print("Enter your SGPA:");
double sgpa = input.nextFloat();
System.out.print("Are you a hosteller?:");
boolean h = input.nextBoolean();

System.out.println("NAME: "+name);
System.out.println("ROLL.NO: "+rno);
System.out.println("SEMESTER: "+sem);
System.out.println("SGPA: "+sgpa);
System.out.println("HOSTELLER: "+h);

}}