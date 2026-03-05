//Quickbite's food delivery System
import java.util.Scanner;
public class Order{
String item_name; int quantity; String del_add; String inst;

public Order(){
this.item_name="Veg Combo";
this.quantity=1;
this.del_add="To be updated";
}

public Order(String item_name, int quantity){
this.item_name=item_name;
this.quantity=quantity;
this.del_add="Home Address on File";
}

public Order(String item_name, int quantity, String del_add, String inst){
this.item_name= item_name;
this.quantity=quantity;
this.del_add=del_add;
this.inst=inst;
}

public void display(){
System.out.println();
System.out.println("-----------------------------------------------------------------------------");
System.out.println("         ORDER DETAILS");
System.out.println("-----------------------------------------------------------------------------");
System.out.println("Item Name: "+item_name);
System.out.println("Quantity: "+quantity);
System.out.println("Delivery Address: "+del_add);
System.out.println("Custom instruction: "+inst);
System.out.println();
}

public static void main(String args[]){
Scanner input= new Scanner(System.in);
System.out.println("QUICKBITE ORDER CREATION SYSTEM");
System.out.println();
System.out.println("1.Quick Order");
System.out.println("2.Order to home address");
System.out.println("3.Order with custom delivery address");
System.out.println();
System.out.println("Enter your choice:");
int ch=input.nextInt();
System.out.println();
if (ch==1){
Order myorder = new Order();
myorder.display();
}
else if (ch==2){
System.out.println("Enter the item name:");
input.nextLine();
String name=input.nextLine();
System.out.println("Enter the Quantity:");
int qn=input.nextInt();
Order myorder = new Order(name,qn);
myorder.display();
}
else if (ch==3){
System.out.println("Enter the item name:");
input.nextLine();
String name=input.nextLine();
System.out.println("Enter the Quantity:");
int qn=input.nextInt();
System.out.println("Enter the Delivery Address:");
input.nextLine();
String add=input.nextLine();
System.out.println("Enter Special cooking instruction:");
String inst=input.nextLine();
Order myorder = new Order(name,qn,add,inst);
myorder.display();
}
else{
System.out.println("Invalid choice");
}
}
}

