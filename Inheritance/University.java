class Person{
String name; String ID;
public void setname(String n){
name=n;
}
public void setid(String id){
ID=id;
}

public String getname(){
return name;
}
public String getid(){
return ID;
}
}

class Student extends Person{
String dept; double cgpa;
public void setdep(String s){
dept=s;
}
public void setcgpa(double cg){
cgpa=cg;
}
public String getdep(){
return dept;
}
public double getcgpa(){
return cgpa;
}
}

class ResearchScholar extends Student{
String topic; String guide;
public void settopic(String t){
topic=t;
}
public void setguide(String g){
guide =g;
}
public String gettopic(){
return topic;
}
public String getguide(){
return guide;
}
}

public class University{
public static void main(String args[]){
ResearchScholar one = new ResearchScholar();
one.setname("Nandini");
one.setid("25213");
one.setdep("CSE");
one.setcgpa(9.06);
one.settopic("Artificial Intelligence");
one.setguide("Radha");

System.out.println();
System.out.println("DETAILS:");
System.out.println("NAME: "+one.getname());
System.out.println("ID: "+one.getid());
System.out.println("DEPARTMENT: "+one.getdep());
System.out.println("CGPA: "+one.getcgpa());
System.out.println("RESEARCH TOPIC: "+one.gettopic());
System.out.println("REASEARCH GUIDE: "+one.getguide());

}
}