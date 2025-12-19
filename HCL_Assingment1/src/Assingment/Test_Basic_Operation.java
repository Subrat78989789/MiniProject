package Assingment;

import java.util.Scanner;

public class Test_Basic_Operation extends Basic_Operations {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first value=");
		int a=sc.nextInt();
		System.out.print("Enter Second value=");
		
		int b=sc.nextInt();
		Basic_Operations bc=new Basic_Operations();
		bc.set_value1(a);
		bc.set_value2(b);
		
		bc.addition();
		bc.subtraction();
		bc.cube(2);
		bc.division();
		bc.multiplication();
		bc.rem();
		bc.square(3);
		bc.absolute(-5.63);
		
		
		
		
	}

}
