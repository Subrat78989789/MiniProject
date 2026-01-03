package consolebank;

import java.util.Scanner;

public class BankApp {
	
	

	Account acc;//Instance variable
	
	//If i will declare Account acc as local variable inside start method then its initialization(means here object) is visible within the start method only if here we do initialization of local variable inside any method like SavingAccount then that initialization will have visibility inside only that SavingAccount method but it we declare Account acc as instance variable then its implementation is visible to every one inside the start() method
	//We can access instance variable directly in non static method and using object in static method like here main method.
	public void start()throws Exception//non static method
	{
	 
	  Scanner sc = new Scanner(System.in);
      
      long ac_no=0;
      String ac_name=null;
      double balance;
      int choice;

      do {
      	
      System.out.println("******Welcome To Bank******");
      System.out.println("1. Savings Account\n2. Current Account");
      System.out.println("3.Deposit\n4.Withdraw\n5.Display Account\n6.Calculate Interest");
      System.out.print("Enter Your Choice:");
 
      choice = sc.nextInt();

      switch (choice) {
		case 1:  
	    sc.nextLine();
  	System.out.print("Enter Saving Account Number:");
  	ac_no=sc.nextLong();
  	sc.nextLine();
  	System.out.print("Accound Holder Name:");
  	ac_name=sc.nextLine();
  	System.out.print("Initial Balance:");
  	balance=sc.nextDouble();
  	acc=new SavingsAccount(ac_no, ac_name, balance);
 	 FileUtil.writeAccountdetails(acc);
 
break;
		case 2:
			  sc.nextLine();
		    	System.out.print("Enter Current Account Number:");
		    	ac_no=sc.nextLong();
		    	sc.nextLine();
		    	System.out.print("Accound Holder Name:");
		    	ac_name=sc.nextLine();
		    	System.out.print("Initial Balance:");
		    	balance=sc.nextDouble();
		    	acc=new CurrentAccount(ac_no, ac_name, balance);
		    	 FileUtil.writeAccountdetails(acc);
		    	
		    	 break;
		case 3:
			int di;
			double dio;
		sc.nextLine();
			System.out.print("Enter Deposit Amount:");
			String deposit=sc.nextLine();
			
			if(deposit.matches("\\d+"))
			{
				di=Integer.parseInt(deposit);
				acc.deposit(di);
			}
			else if(deposit.matches("\\d+\\.\\d+")) {
				 dio=Double.parseDouble(deposit);
				 acc.deposit(dio);
			}
			else {
				System.out.println("Invalid amount");
			}
			FileUtil.writeAccountdetails(acc);
			break;
	   case 4:
		   sc.nextLine();
		   System.out.print("Enter Withdrwal amount:");
		   Double amt=sc.nextDouble();
		   acc.withdraw(amt);
		   FileUtil.writeAccountdetails(acc);
		   break;
	   case 5:
		   sc.nextLine();
		   System.out.println("Display Accounts");
		   acc.display();
		   break;
	   case 6:
		   sc.nextLine();
		   acc.calculateInterest();//Runtime Polymorphism
		   break;
		
	   default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
			
		}
   }
      while(choice>0 && choice<7);
  }
    public static void main(String[] args) throws Exception {
    	BankApp bankApp=new BankApp();
    	bankApp.start();
    
      
}
    }
