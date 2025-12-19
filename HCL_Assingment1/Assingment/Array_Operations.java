package Assingment;




import java.util.Arrays;
import java.util.Scanner;


public class Array_Operations {
	

	static Scanner sc=new Scanner(System.in);
	public static void Insertion(int a[])
	{
		System.out.print("Enter Elements= ");
		for(int i=0;i<a.length;i++)
		{
	  a[i]=sc.nextInt();
		
		}	
		
		
	}
	public static void Deletion(int a[])
	{
		System.out.print("Enter Position= ");
		int pos=sc.nextInt();
		if(pos>=1 && pos<=a.length)
		{
		for(int i=pos;i<a.length;i++)
		{
			a[i-1]=a[i];
			
		}
		a[a.length-1]=0;
		}
		else {
			System.out.println("Not valid Position");
		}
		
	}
	public static void Traverse(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void linear_search(int a[])
	{
		System.out.print("Enter Key= ");
		int key=sc.nextInt();
		boolean b=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				b=false;
				System.out.println("Element Found");
				break;
			}
		
		}
		if(b)
		{
			System.out.println("Element Not Found");
		}
	}
	public static void Binary_search(int a[])
	{
		System.out.print("Enter Key= ");
		int key=sc.nextInt();
		Arrays.sort(a);
		int i=0;
		int j=a.length-1;
		boolean b=true;
		while(i<=j)
		{
			int mid=(i+j)/2;
			if(a[mid]==key)
			{
				System.out.println("Element Found");
				b=false;
				break;
			}
			else if(a[mid]<key)
			{
				i=mid+1;
			}
			else if(a[mid]>key)
			{
				j=mid-1;
			}
		}
		if(b)
		{
			System.out.println("Element Not Found");
		}
		}
	public static void maximum_value(int a[])
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Value= "+max);
	}
	public static void count_even_odd(int a[])
	{
		int even_count=0;
		int odd_count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even_count++;
			}
			else {
				odd_count++;
			}
		}
		System.out.println("Even Count= "+even_count+" and "+"Odd Count= "+odd_count);
		
	}
	public static void Insertion_sort(int a[])
	{
		 
		        for(int i=1;i<a.length;i++)//this indicates no. of rounds
		        {
		            int j=i-1;
		           int temp=a[i];
		            while(j>=0 && a[j]>temp)
		            {
		                a[j+1]=a[j];
		                j--;
		            }
		            a[j+1]=temp;
		        }
		       
		    }
	}
	


