import java.util.Scanner;
class Cafe{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("MENU:");
System.out.println("1.Beverages-Rs.100");
System.out.println("2.Starters-Rs.200");
System.out.println("3.Main Course-Rs.400");
System.out.println("4.Desserts-Rs.150");
System.out.println("5.Combo -Rs.600");
double total=0.0; boolean o;
do{
System.out.print("Enter the s.no you want to order: ");
int ch=input.nextInt();
System.out.println("Ordered successfully!");
switch(ch){
case 1:
total+=100.0;
break;
case 2:
total+=200.0;
break;
case 3:
total+=400.0;
break;
case 4:
total+=150.0;
break;
case 5:
total+=600.0;
break;
default:
System.out.println("INVALID CHOICE");
}
System.out.println();
System.out.println("Do you want to order something else?");
o = input.nextBoolean();
}while(o);
System.out.println();
System.out.println("TOTAL: "+total);
if (total>1000.0){
double dis = 0.1*total;
System.out.println("DISCOUNT: "+dis);
total-=dis;
System.out.println("FINAL BILL: "+total);
}
else if (total>2000.0){
double dis = 0.2*total;
System.out.println("DISCOUNT: "+dis);
total-=dis;
System.out.println("FINAL BILL: "+total);
}
}
}
