package Assingment;

public class Bank_Menu{
	private static String name;
	private static long acc_no;
	private static int pin;
	private static String address;
	private static long phone;
	private double deposit;
	private double balance;
	private double withdraw;
	public  void set_name(String name)
	{
		this.name=name;
	}
	public void set_address(String address)
	{
		this.address=address;
	}
	public void set_phone(long phone)
	{
		this.phone=phone;
	}
	public void set_acc_no(long acc_no)
	{
		this.acc_no=acc_no;
	}
	public void set_pin(int pin)
	{
		this.pin=pin;
	}
	public void deposit(double deposit,int pin)
	{
		if(this.pin==pin)
		{
		this.deposit=deposit;
		balance=balance+deposit;
		}
		else {
			System.out.println("Invalid Pin");
		}
		
	
	}
//	public void set_balance()
//	{
//		balance=balance+deposit;
//	}
	public void get_balance()
	{
		System.out.println("Balance is= "+balance);
	}
	public void withdraw(double amount,int pin)throws Insufficient_Balance_Exception
	{
		if(this.pin==pin)
		{
			if(balance>=amount)
			{
		       balance=balance-amount;
			}
			else {
				throw new Insufficient_Balance_Exception("Insufficient Balance",amount);
			}
		}
		else {
			System.out.println("Invalid Pin");
		}
	}
	
	public static void Account_Dispaly()
	{
		System.out.println("Account Holder Name= "+name);
		System.out.println("Account Holder Account_No= "+acc_no);
		System.out.println("Account Holder Phone_Number= "+phone);
		System.out.println("Account Holder Address= "+address);
		
		
	}

}
