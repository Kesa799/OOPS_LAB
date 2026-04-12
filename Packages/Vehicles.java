package vehicle;

interface Vehicle{
void start();
void stop();
}

class Car implements Vehicle{
@Override
public void start(){
System.out.println("The car has started!");
}
@Override
public void stop(){
System.out.println("The car has stopped!");
}
}

class Bike implements Vehicle{
@Override
public void start(){
System.out.println("The bike has started!");
}
@Override
public void stop(){
System.out.println("The bike has stopped!");
}
}

public class Vehicles{
public static void main(String args[]){
Car c = new Car();
c.start();
c.stop();
Bike b = new Bike();
b.start();
b.stop();
}
}
