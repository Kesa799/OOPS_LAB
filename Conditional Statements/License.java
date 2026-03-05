import java.util.Scanner;
class License{
public static void main(String args[]){
String name; int age; String type;
Scanner input = new Scanner(System.in);
System.out.print("Enter the name: ");
name= input.nextLine();
System.out.print("Enter the age: ");
age=input.nextInt();
System.out.print("Enter the type: ");
input.nextLine();
type= input.nextLine();

if (type.equalsIgnoreCase("car")){
if (age>=18){
System.out.println("Eligible for car license!");
}
else{
System.out.println("Not Eligible for car license!");
}
}

else if (type.equalsIgnoreCase("commercial vehicle")){
if (age>=20){
System.out.println("Eligible for commercial vehicle license!");
}
else{
System.out.println("Not Eligible for commercial vehicle license!");
}
}

else if (type.equalsIgnoreCase("motorcycle learner permit")){
if (age>=16){
System.out.println("Eligible for motorcycle learner permit license!");
}
else{
System.out.println("Not Eligible for motorcycle learner permit license!");
}
}
else{
System.out.println("Invalid License Category");
}
}}