import java.util.Scanner;
class SimpleInterest{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("\t\t\tSIMPLE INTEREST CALCULATION");
System.out.print("Enter the principal amount:");
double p = input.nextFloat();
System.out.print("Enter the Rate of interest:");
double r = input.nextFloat();
System.out.print("Enter the Time period:");
int t = input.nextInt();

double si = (p*r*t)/100;

System.out.println("PRINCIPAL AMOUNT: "+p);
System.out.println("RATE OF INTEREST: "+r);
System.out.println("TIME PERIOD: "+t);
System.out.println("SIMPLE INTEREST: "+si);
}}





