package mathoperations;

public class mathoperations{
int a; int b;
public mathoperations(int a, int b){
this.a=a;
this.b=b;
}

public void add(){
System.out.println(a+b);
}

public static void main(String args[]){
mathoperations obj = new mathoperations(10,20);
obj.add();
}
}