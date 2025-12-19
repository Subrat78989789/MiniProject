package Assingment;



public class Basic_Operations {
	private   int a;
	private   int b;
	public void set_value1(int a)
	{
		//this.a=a;
		//Note->this cannot be used inside static methods because static methods do not belong to any object; they belong to the class.
		this.a=a;
	}
	public  void set_value2(int b)
	{
		this.b=b;
	}
	
	public void addition()
	{
		System.out.println("addition value is="+(a+b));
	}
	public void subtraction()
	{
		System.out.println("subtraction value is="+(a-b));
	}
	public void multiplication()
	{
		System.out.println("multiplication value is="+(a*b));
	}
	public void division()
	{
		if(b!=0)
		{
		System.out.println("division value is="+(a/b));
		}
		else {
			System.out.println("Arithmetic Exception");
		}
	}
	public void rem()
	{
		if(b!=0)
		{
		System.out.println("Remainder value is="+(a%b));
		}
		else {
			System.out.println("Arithmetic Exception");
		}
	}
	public void square(int h) 
	{
		System.out.println("Square value is="+(h*h));
		
	}
	public void cube(int f)
	{
		System.out.println("Cube value is="+(f*f*f));
	}
	public void absolute(double g)
	{
		System.out.println("Absolute Value is="+Math.abs(g));
	}

}
