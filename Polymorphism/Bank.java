class Bank{
double balance=0.0;
public void deposit(String accno,double amt){
balance+=amt;
System.out.println("Deposited successfully in "+accno);
}

public void deposit(String accno, String cqno, double amt){
balance+=amt;
System.out.println("Deposited successfully in "+accno+" using cheque number "+cqno);
}

public void deposit(String upi,int pin, double amt){
balance+=amt;
System.out.println("Online transfer to UPI ID "+upi+" is successful");
}

public static void main(String args[]){
Bank obj = new Bank();
obj.deposit("AB23707",50000.0);
obj.deposit("AB32043",100000.0);
obj.deposit("abcd@oksbi",1426,30000.0);
}
}
