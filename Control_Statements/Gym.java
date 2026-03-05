public class Gym{
String id; String name; int age; String mem; double fee;

public Gym(String id,String name,int age,String mem,double fee){
this.id=id;
this.name=name;
this.age=age;
this.mem=mem;
this.fee=fee;
}

public void display(){
System.out.println();
System.out.println("NAME: "+name);
System.out.println("ID: "+id);
System.out.println("AGE: "+age);
System.out.println("MEMBERSHIP TYPE: "+mem);
System.out.println("FEE: "+fee);
}

public void check(){
if (age<25){
System.out.println("Eligible for Youth Discount!");
}
else{
System.out.println("Not Eligible for Youth Discount!");
}
}
public static void main(String args[]){
Gym g1 = new Gym("234","Ram",18,"Monthly",15000.0);
Gym g2 = new Gym("235","John",20,"Quarterly",50000.0);
Gym g3 = new Gym("236","Jeeva",23,"Annual",90000.0);
Gym g4 = new Gym("238","Harry",27,"Monthly",15000.0);
g1.display();
g1.check();
g2.display();
g2.check();
g3.display();
g3.check();
g4.display();
g4.check();
}
}
