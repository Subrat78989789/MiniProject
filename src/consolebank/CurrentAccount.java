package consolebank;

public class CurrentAccount extends Account {
public CurrentAccount(long accNo, String holderName, double balance) {
	super(accNo, holderName, balance,CurrentAccount.class);
	// TODO Auto-generated constructor stub
}
public void calculateInterest() {
	
	double interest=(double)15/100;
	//due to we extend Account we can access all members thats why balance is accessed
	double interest_gained=(double)interest*balance;
	System.out.println("Total Interset gained amount:"+interest_gained);
	balance+=interest_gained;
	System.out.println("After adding interest gained in balance total balance is:"+balance);
	
}
}