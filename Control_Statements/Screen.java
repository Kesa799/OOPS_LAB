public class Screen{
String name; double showtime; int screen; int available; int max

public Screen(String name, double showtime, int screen, int seat, int max){
this.name=name;
this.showtime=showtime;
this.screen = screen;
this.available = seat;
this.max = max;
}

public void book(int seat){
if (seat<=available){
available = available-seat;
System.out.println(seat+" Tickets successfully booked!");
}
else{
System.out.println("Enough seats are not available :(");
}
}

public void cancel(int seat){
if (available+seat<=max){
available= available+seat;
System.out.println("Tickets successfully cancelled!");
}
}

public void display(){
System.out.println();
System.out.println("CURRENT BOOKING DETAILS");
System.out.println("NAME OF THE SHOW: "+name);
System.out.println("SHOWTIME: "+showtime);
System.out.println("SCREEN NUMBER: "+screen);
System.out.println("AVAILABLE SEATS: "+available);
System.out.println();
}

public static void main(String args[]){
Screen s1 = new Screen("Movie1",2.5,1,100,100);
s1.book(10);
s1.book(15);
s1.book(5);
s1.book(15);
s1.book(15);
s1.book(20);
s1.book(15);
s1.book(10);
s1.cancel(5);
s1.book(10);

s1.display();

Screen s2 = new Screen("Movie2",2.5,2,100,100);
s2.book(10);
s2.book(15);
s2.book(5);
s2.book(15);
s2.book(15);
s2.book(20);
s2.book(15);
s2.book(10);
s2.cancel(15);
s2.book(10);

s2.display();
}
}

