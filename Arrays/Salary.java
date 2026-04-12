public class Salary{
public static void main(String args[]){
double[] sal = new double[5];
sal[0]=50000.0;
sal[1]=40000.0;
sal[2]=60000.0;
sal[3]=90000.0;
sal[4]=70000.0;

double highest = sal[0]; double lowest = sal[0];
for (double i:sal){
if (i>highest){
highest=i;
}
if (i<lowest){
lowest=i;
}
}

System.out.println("Highest salary: "+highest);
System.out.println("Lowest Salary: "+lowest);
}}