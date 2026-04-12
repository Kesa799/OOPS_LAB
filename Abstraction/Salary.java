abstract class Employee{
abstract void calculateSalary();
}

class Manager extends Employee{
@Override
public void calculateSalary(){
System.out.println("Rs.200000/-");
}
}

class Developer extends Employee{
@Override
public void calculateSalary(){
System.out.println("Rs.100000/-");
}
}

public class Salary{
public static void main(String args[]){
Manager m = new Manager();
Developer d = new Developer();
m.calculateSalary();
d.calculateSalary();
}
}