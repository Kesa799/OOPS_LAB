class Animal{
String name; int age; String diet_type;
public void set_name(String nm){
name=nm;}
public void set_age(int ag){
age=ag;}
public void set_diet(String dt){
diet_type=dt;}
public String getname(){
return name;
}
public int getage(){
return age;
}
public String getdiet(){
return diet_type;
}
public void common(){
System.out.println("It can eat.");
System.out.println("It can sleep.");
}
}

class Mammal extends Animal{
String fur_color;
public void set_fur(String c){
fur_color=c;
}
public String get_fur(){
return fur_color;
}
public void mam_fun(){
System.out.println("It can run.");
}
}

class Bird extends Animal{
int wingspan;
public void set_wingspan(int s){
wingspan = s;
}
public int get_wingspan(){
return wingspan;
}
public void bird_fun(){
System.out.println("It can fly.");
}
}

class Reptile extends Animal{
String venom;
public void set_ven(String v){
venom=v;
}
public String get_ven(){
return venom;
}
public void rep_fun(){
System.out.println("It can crawl.");
}
}

public class Zoo{
public static void main(String args[]){
Mammal dog = new Mammal();
Bird dove = new Bird();
Reptile cobra = new Reptile();

dog.set_name("Tommy");
dog.set_age(2);
dog.set_diet("Non-veg");
dog.set_fur("Gold");
System.out.println("DETAILS:-");
System.out.println("NAME: "+dog.getname());
System.out.println("AGE: "+dog.getage());
System.out.println("DIET TYPE: "+dog.getdiet());
System.out.println("FUR COLOUR: "+dog.get_fur());
System.out.println("BEHAVIOURS: ");
dog.common();
dog.mam_fun();

System.out.println();
dove.set_name("Sweetie");
dove.set_age(2);
dove.set_diet("Veg");
dove.set_wingspan(20);
System.out.println("DETAILS:-");
System.out.println("NAME: "+dove.getname());
System.out.println("AGE: "+dove.getage());
System.out.println("DIET TYPE: "+dove.getdiet());
System.out.println("FUR COLOUR: "+dove.get_wingspan());
System.out.println("BEHAVIOURS: ");
dove.common();
dove.bird_fun();

System.out.println();
cobra.set_name("Naga");
cobra.set_age(2);
cobra.set_diet("Non-Veg");
cobra.set_ven("Venomous");
System.out.println("DETAILS:-");
System.out.println("NAME: "+cobra.getname());
System.out.println("AGE: "+cobra.getage());
System.out.println("DIET TYPE: "+cobra.getdiet());
System.out.println("FUR COLOUR: "+cobra.get_ven());
System.out.println("BEHAVIOURS: ");
cobra.common();
cobra.rep_fun();
}
}
