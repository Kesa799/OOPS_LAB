import java.util.Scanner;
class Nursery{
String name; String id; String type; double price; int stock;

public Nursery(String name, String id, String type, double price, int stock){
this.name=name;
this.id=id;
this.type=type;
this.price=price;
this.stock=stock;
}

public void purchase(int q){
if (q<=stock){
System.out.println("Purchase Successful!");
stock-=q;
}
else{
System.out.println("Insufficient stock!");
}
}

public void restock(int r){
stock+=r;
}

public void display(){
System.out.println();
System.out.println("PLANT NAME: "+name);
System.out.println("PLANT ID: "+id);
System.out.println("TYPE: "+type);
System.out.println("PRICE: "+price);
System.out.println("STOCK: "+stock);
}

public static void main(String args[]){
Scanner input = new Scanner(System.in);
Nursery rose = new Nursery("Rose","R23","Outdoor",250.0,25);
Nursery lily = new Nursery("Lily","L16","Outdoor",320.0,15);
Nursery Marigold = new Nursery("Marigold","M19","Outdoor",270.0,10);
rose.display();
lily.display();
Marigold.display();

System.out.println("Which plant are you interested to buy?");
System.out.println("1.Rose");
System.out.println("2.Lily");
System.out.println("3.Marigold");
System.out.println();

System.out.print("Enter your choice:");
int ch = input.nextInt();
System.out.print("Enter the quantity:");
int q = input.nextInt();
switch(ch){
case 1:
rose.purchase(q);
rose.restock(5);
break;
case 2:
lily.purchase(q);
lily.restock(5);
break;
case 3:
Marigold.purchase(q);
Marigold.restock(5);
break;
default:
System.out.println("Enter a valid choice!");
}
}
}

