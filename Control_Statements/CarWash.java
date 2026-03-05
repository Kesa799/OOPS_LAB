import java.util.Scanner;
public class CarWash{
String number; String name; String model; String colour;
public CarWash(String number,String name,String model,String colour){
this.name=name;
this.number=number;
this.model=model;
this.colour=colour;
}

public void ext(){
System.out.println("Exterior Wash");
}

public void vac(){
System.out.println("Interior Vacuum");
}

public void full(){
System.out.println("full detail Service");
}

public void display(){
System.out.println("OWNER NAME: "+name);
System.out.println("CAR NUMBER: "+number);
System.out.println("MODEL: "+model);
System.out.println("COLOUR: "+colour);
}

public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("1.Interior Vacuum");
System.out.println("2.Exterior wash");
System.out.println("3.Full detail service");

System.out.println();
System.out.println("First Car");
System.out.print("Enter your choice:");
int ch=input.nextInt();
System.out.println();
System.out.print("Enter the Owner Name:");
input.nextLine();
String nm1=input.nextLine();
System.out.print("Enter the Car Number:");
String num1=input.nextLine();
System.out.print("Enter the model:");
String mod1=input.nextLine();
System.out.print("Enter the Colour:");
String col1=input.nextLine();
CarWash car1 = new CarWash(num1,nm1,mod1,col1);
car1.display();
switch(ch){
case 1:
car1.vac();
break;
case 2:
car1.ext();
break;
case 3:
car1.full();
break;
default:
System.out.println("INVALID CHOICE");
}

System.out.println();
System.out.println("Second Car");
System.out.print("Enter your choice:");
int ch2=input.nextInt();
System.out.println();
System.out.print("Enter the Owner Name:");
input.nextLine();
String nm2=input.nextLine();
System.out.print("Enter the Car Number:");
String num2=input.nextLine();
System.out.print("Enter the model:");
String mod2=input.nextLine();
System.out.print("Enter the Colour:");
String col2=input.nextLine();
CarWash car2 = new CarWash(num2,nm2,mod2,col2);
car2.display();
switch(ch2){
case 1:
car2.vac();
break;
case 2:
car2.ext();
break;
case 3:
car2.full();
break;
default:
System.out.println("INVALID CHOICE");
}

System.out.println();
System.out.println("Third Car");
System.out.print("Enter your choice:");
int ch3=input.nextInt();
System.out.println();
System.out.print("Enter the Owner Name:");
input.nextLine();
String nm3=input.nextLine();
System.out.print("Enter the Car Number:");
String num3=input.nextLine();
System.out.print("Enter the model:");
String mod3=input.nextLine();
System.out.print("Enter the Colour:");
String col3=input.nextLine();
CarWash car3 = new CarWash(num3,nm3,mod3,col3);
car3.display();
switch(ch3){
case 1:
car3.vac();
break;
case 2:
car3.ext();
break;
case 3:
car3.full();
break;
default:
System.out.println("INVALID CHOICE");
}

}}

 