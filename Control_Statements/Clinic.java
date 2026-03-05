import java.util.Scanner;
class Clinic{
String id; String name; String number; String procedure;

public Clinic(String id, String name, String number, String procedure){
this.id=id;
this.name=name;
this.number=number;
this.procedure=procedure;
}

public void display(){
System.out.println();
System.out.println("DETAILS:");
System.out.println("PATEIENT ID: "+id);
System.out.println("NAME: "+name);
System.out.println("CONTACT NUMBER: "+number);
System.out.println("PROCEDURE: "+procedure);
}

public void clean(){
System.out.println("COST: Rs.500");
}

public void fill(){
System.out.println("COST: Rs.1500");
}

public void extract(){
System.out.println("COST: Rs.2000");
}

public void rc(){
System.out.println("COST: Rs.8000");
}

public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("CLINIC MNAGEMENT SYSTEM");
System.out.println("1.Cleaning");
System.out.println("2.Filling");
System.out.println("3.Extraction");
System.out.println("4.Root Canal");
System.out.print("Enter your choice:");
int ch = input.nextInt();
System.out.print("Enter your name:");
input.nextLine();
String nm= input.nextLine();
System.out.print("Enter your id:");
String id=input.nextLine();
System.out.print("Enter your contact number:");
String num=input.nextLine();
switch(ch){
case 1:
Clinic p1 = new Clinic(id,nm,num,"Cleaning");
p1.display();
p1.clean();
break;
case 2:
Clinic p2 = new Clinic(id,nm,num,"Filling");
p2.display();
p2.fill();
break;
case 3:
Clinic p3 = new Clinic(id,nm,num,"Extraction");
p3.display();
p3.extract();
break;
case 4:
Clinic p4 = new Clinic(id,nm,num,"Root Canal");
p4.display();
p4.rc();
break;
default:
System.out.println("INVALID CHOICE!");
}
}}
