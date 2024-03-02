package BankAccount;

public class Account 
{
    private double balance;
     
     public Account(String name, long num)
     {
         balance = 0.00;
    	 System.out.println("Account Created");
     }
     
     public void deposit(double amt)
     {
    	 balance = balance + amt;
    	 System.out.println("Amount Deposited.");
     }
     
     public void withdraw(double amt) throws BankAccountException
     {
    	 try
    	 { 
    	    if(balance >= amt)
    	    {
    		    balance = balance - amt;
        	    System.out.println("Amount Withdrawn");
    	    }
    	    else
    	    {
    		    throw new BankAccountException("Could not Withdraw: Insufficent Amount.");
    	    }
    	 }
    	 catch(BankAccountException bae)
    	 {
         }
     }
     
     public void printBalance()
     {
    	 System.out.println("Current balance: " + balance);    	 
     }
     public double getBalance()
     {
         return balance;
     }
}
