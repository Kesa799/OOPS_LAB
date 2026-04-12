interface A{
void meth1();
void meth2();
}

class Myclass implements A{
@Override
public void meth1(){
System.out.println("Method 1");
}
@Override
public void meth2(){
System.out.println("Method 2");
}
}

public class Main{
public static void main(String args[]){
Myclass m = new Myclass();
m.meth1();
m.meth2();
}
}