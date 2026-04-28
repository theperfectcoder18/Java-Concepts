package data_hiding;

public class Customer {
private double balance = 1000;

public void deposit (int amount){
    if(amount <=0)
    {
        System.out.println("You are a Hakcer");
    }
    else
    {
        this.balance = this.balance + amount;
        System.out.println("Balance after deposit: " + this.balance);
    }
    
 
}
public void withdraw(int withdraw)
{
    this.balance = this.balance - withdraw;
    System.out.println("Balance after withdraw :" + this.balance);
}
}