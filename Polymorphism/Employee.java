class FullTime{
public void CalcSal(){
System.out.println("100000");
}
}
class PartTime{

public void CalcSal(){
int h = 3;
double rph = 1000;
System.out.println(h*rph*30);
}
}
class Contract{

public void CalcSal(){
int month = 6;
System.out.println(month*30000);
}
}

public class Employee{
public static void main(String args[]){
FullTime f = new FullTime();
PartTime p = new PartTime();
Contract c = new Contract();

f.CalcSal();
p.CalcSal();
c.CalcSal();
}
}