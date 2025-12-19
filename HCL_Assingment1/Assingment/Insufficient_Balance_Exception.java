package Assingment;

public class Insufficient_Balance_Exception extends Exception 
{
	private double amount;
	public Insufficient_Balance_Exception(String message,double amount)
	{
		
		super(message);
		this.amount=amount;
		
	}
	public void get_amount()
	{
		System.out.println(amount);
	}
	
	
	

}
