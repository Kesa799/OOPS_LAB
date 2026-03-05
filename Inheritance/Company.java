class Employee{
String name; String ID; double salary;
public void setname(String n){
name=n;
}
public void setid(String id){
ID=id;
}
public void setsal(double sal){
salary=sal;
}

public String getname(){
return name;
}
public String getid(){
return ID;
}
public double getsal(){
return salary;
}
}

class TeamLead extends Employee{
int teamsize; double bonus;
public void setsz(int s){
teamsize=s;
}
public void setbonus(double b){
bonus=b;
}
public int getsz(){
return teamsize;
}
public double getbonus(){
return bonus;
}
}

class ProjectManager extends TeamLead{
String topic; double budget;
public void settopic(String t){
topic=t;
}
public void setbud(double bud){
budget=bud;
}
public String gettopic(){
return topic;
}
public double getbud(){
return budget;
}
}

public class Company{
public static void main(String args[]){
ProjectManager one = new ProjectManager();
one.setname("Nandini");
one.setid("25213");
one.setsal(100000.0);
one.setsz(9);
one.setbonus(5000.0);
one.settopic("AI");
one.setbud(1000000.0);

System.out.println();
System.out.println("DETAILS:");
System.out.println("NAME: "+one.getname());
System.out.println("ID: "+one.getid());
System.out.println("SALARY: "+one.getsal());
System.out.println("TEAMSIZE: "+one.getsz());
System.out.println("BONUS: "+one.getbonus());
System.out.println("PROJECT TOPIC: "+one.gettopic());
System.out.println("PROJECT BUDGET: "+one.getbud());

}
}