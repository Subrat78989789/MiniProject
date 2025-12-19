package Assingment;



public class Bank extends Bank_Menu {
	
	Bank_Menu b=new Bank_Menu();
	public  void create_account(String acc_name,long account_num,long phone,int pin,String address)
	{
		b.set_acc_no(account_num);
		b.set_name(acc_name);
		b.set_phone(phone);
		b.set_address(address);
		b.set_pin(pin);
		
	}
	public static void main(String[] args) throws Insufficient_Balance_Exception
	{
		Bank ba=new Bank();
		ba.create_account("Admin",4562368963L,9893020359L,9893,"Dalli");
		Account_Dispaly();
		ba.deposit(150.23,9895);
		ba.get_balance();
		try {
		ba.withdraw(156.569,9893);
		}
		catch(Insufficient_Balance_Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	
		
		ba.get_balance();
		
	}

}
