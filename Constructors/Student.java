import java.util.Scanner;
public class Student{
String name; int roll_no; String course; 
static int rn_c=101;

public Student(){
this.name="Unassigned";
this.roll_no=0;
this.course="General";
}

public Student(String name, String course){
this.name=name;
this.roll_no=rn_c;
rn_c++;
this.course=course;
}

public Student(Student s){
this.name=s.name;
this.roll_no=rn_c;
rn_c++;
this.course=s.course;
}

public void display(){
System.out.println();
System.out.println("------------------------------------------------------------");
System.out.println("                 STUDENT DETAILS");
System.out.println("------------------------------------------------------------");
System.out.println("Name: "+name);
System.out.println("Roll No."+roll_no);
System.out.println("Course: "+course);
System.out.println();
}

public static void main(String args[]){
Scanner input = new Scanner(System.in);
Student two=null;
while (true){
System.out.println("EduTrack Enrollment System");
System.out.println("1.Display default student record");
System.out.println("2.Enroll new Student record");
System.out.println("3.Branch Transfer");
System.out.println("4.EXIT");
System.out.println();
System.out.print("Enter the choice:");
int ch=input.nextInt();
switch(ch){
case 1:
Student one = new Student();
one.display();
break;

case 2:
System.out.print("Enter the Student name:");
input.nextLine();
String nm=input.nextLine();
System.out.print("Enter the couse:");
String co=input.nextLine();
Student two = new Student(nm,co);
two.display();
break;

case 3:
if (two!=null){
Student three = new Student(two);
three.display();
}
else{
System.out.println("No student records to copy!");
}
break;

case 4:
return;

default:
System.out.println("Invalid choice!");
}
}
}}