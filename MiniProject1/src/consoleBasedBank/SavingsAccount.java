package consoleBasedBank;

public class SavingsAccount extends Account {
	public SavingsAccount(long accNo, String holderName, double balance) {
		super(accNo,holderName,balance,SavingsAccount.class);//SavingsAccount.class returns <consoleBasedBank.SavingAccount>
		}
	@Override
	public void calculateInterest() {
		
		double interest=(double)10/100;//due to we extend Account we can access all members thats why balance is accessed
		double interest_gained=(double)interest*balance;
		System.out.println("Total Interset gained amount:"+interest_gained);
		balance+=interest_gained;
		System.out.println("After adding interest gained in balance total balance is:"+balance);
		
	}

}
