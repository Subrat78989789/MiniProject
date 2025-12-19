package Assingment;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;

public class String_Operation {
	public static void main(String[] args) {
		
	
	String name="Ravi Prasad";

	
	
	//Length of String
	int length=name.length();//length() is non static method because we are calling it using string object
	System.out.println("Length of String="+length);
	
	
	//Check String is empty or not
	boolean b=name.isEmpty();
	System.out.println(b?"String is empty":"String is not empty");
	
	
	//Accessing Character from String
	char c=name.charAt(2);
	System.out.println("Character at given index is="+c);
	
	
	
	//toString() to convert the primitive and non primitive type into String type object
	//It is used for readable form understanding
	int a=56;
	Integer k=78;
	String f=Integer.toString(a);
	System.out.println("Integer is converted to String:"+f);//Converting integer to String
	//or
	String h=String.valueOf(k);//valueOf method internally calls Integer.toString()
	System.out.println("Integer is converted to String:"+h);//Converting integer to String
	StringBuilder sb=new StringBuilder("123");
	System.out.println("StringBuilder object into String Object:"+sb.toString());//Converting String Builder to String
	
	
	
	
//equals() is used for comparing the two string on the basis of content
	String name1="Ravi Prasad";
	boolean bo=name.equals(name1);
	System.out.println(bo?"Both Strings are same":"Both String are not same");
	
	
	
//compareTo() this method is used to comape two strings lexicographically(dictionary order)
	String fruit1="apple";
	String fruit2="mango";
	String fruit3="apple";
	//compareTo() method returns 0,negative integer,positive integer
	//Case 1->if current String is lexicographically less than specified String then result is negative integer
	int res=fruit1.compareTo(fruit2);
	System.out.println("compareTo() method:"+res);//negative differnce(gap) between ascii value of a(apple) and m(mango)
	
	//Case 2->if current String is lexicographically greater than specified String then result is positive integer
		int res1=fruit2.compareTo(fruit1);
		System.out.println("compareTo() method:"+res1);//positive differnce(gap) between ascii value of a and m
		
   //Case 2->if both string are same then result is 0
int res3=fruit1.compareTo(fruit3);
System.out.println("compareTo() method:"+res3);//no difference beyween a & a




//contains() checks that specified substring is part of the current string or not
String greet1="HelloHello WorldWorld";
String greet2="He";
boolean gr=greet1.contains(greet2);//current string is greet1 and specified string is greet2
System.out.println(gr?"Contains Specified String":"Not Contains Specified String");




//indexOf() method returns first occurence of Specified character,string
int idx=greet1.indexOf('l');
System.out.println("first occurence of specified character is:"+idx);
int idx1=greet1.indexOf("Hello");
System.out.println("first occurence of specified String is:"+idx1);




//lastindexOf() method returns last occurence of Specified character
int idx2=greet1.lastIndexOf('l');
System.out.println("last occurence of specified character is:"+idx2);
int idx3=greet1.lastIndexOf("Hello");
System.out.println("last occurence of specified String is:"+idx3);




//startsWith() method is used to check the given string is starting with specified string not
boolean chk1=greet1.startsWith("H");
System.out.println(chk1?"Given String starts with specified string":"Given String doesn't starts with specified string");




//endsWith() method is used to check the given string is ending with specified string not
boolean chk2=greet1.endsWith("ld");
System.out.println(chk2?"Given String ends with specified string":"Given String doesn't ends with specified string");




//matches()->method in java is used to check if a string entirely conforms to a given regular expression(regx)
//public boolean matches(String regx)
String mail="guptasubrat111@gmail.com";
String regxString="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";//regx for validating email
boolean match=mail.matches(regxString);
System.out.println(match?"Given String belongs to regx":"Given String not belongs to regx");




//substring() method is used to get the substring from given string
String str="Java Programming";
String sub_str1=str.substring(3,8);//index 8 is excluded
String sub_str2=str.substring(6);
System.out.println("Substring of given string according to specified indexes:"+sub_str1);
System.out.println("Substring of given string according to specified index: "+sub_str2);




//toLowerCase() convert Uppercase character of string to lower case character
String case1="HeLlO";
System.out.println("LowerCase converted String: "+case1.toLowerCase());




//toUpperCase() convert Lowercase character of string to Upper case character
String case2="HeLlO";
System.out.println("LowerCase converted String: "+case2.toUpperCase());




//trim() method is used to remove the suffix and prefix spaces from string
String trm="  Helax How are you   ";
System.out.println("Trim String is:"+trm.trim());




//replace()method is used to replace character or range of character from string
String rpl="Hi Honey";
String after_rpl=rpl.replace('H','B');//old char is H and new char is B
System.out.println("Replacing character: "+after_rpl);


String after_rpl2=rpl.replace("Honey","Rahul");
System.out.println("Replaced Substring: "+after_rpl2);




//split() method is used to split the String according to delimeter
String spt="123/456/789";
String sp[]=spt.split("/");// here delimeter or regx is "/"
ArrayList<String> as=new ArrayList<>(Arrays.asList(sp));//In this way of declaration list is modifiable
System.out.println("Splitted Strings:");
System.out.println(as);

List<String> ap=Arrays.asList(sp);//In this way of declaration list is not modifiable
System.out.println(ap);




//join()->this method introduced in java8 it is a static method that concatenates a set of strings with a specified delimeter inserted between each element.
//It is a convenient way to create a single delimited string from an array or a collection

String dlm="123/456/789";
String sps[]=spt.split("/");
ArrayList<String> dlm_list=new ArrayList<>(Arrays.asList(sp));//In this way of declaration list is modifiable

String join=String.join(",",dlm_list);
System.out.println("Joined String using String.join(): "+join);




//valueof() method has major 2 perspectives:

//Perspective 1->The String.valueOf() Method

//The String.valueOf() method is a versatile, overloaded static method that converts various types into their String representation. 
//Purpose: To generate a human-readable string from primitive data types (like int, boolean, char, double, float, long) or objects.
//Null Safety: A key feature is its ability to handle null object references gracefully. When passed a null object, it returns the string "null", whereas calling toString() on a null object would throw a NullPointerException.
//Usage Examples:
//String.valueOf(100); returns the string "100".
//String.valueOf(true); returns the string "true".
//String.valueOf(char[] data); returns a string from a character array. 

//Perspective 2->Wrapper Class valueOf() Methods

//Wrapper classes (e.g., Integer, Double, Boolean, Character) also have static valueOf() methods. These convert primitive values or strings into their corresponding object wrappers. 
//Purpose: To obtain an object wrapper instance of a specific type.
//Caching: For some wrapper classes (like Integer for values between -128 and 127), valueOf() utilizes caching to improve performance by reusing frequently requested objects.
//Usage Examples:
//Integer.valueOf(10); returns an Integer object with the value 10.
//Double.valueOf("5.5"); returns a Double object with the value 5.5.


//Perspective 1
int sd=789;
String conv=String.valueOf(sd);//valueOf method internally calls Integer.toString()
System.out.println("Integer is converted to String:"+conv);//Converting integer to String

//Perspective 2
int val1=56;
Integer ob1=Integer.valueOf(val1);
System.out.println("Primitive to non-primitive datatype conversion: "+ob1);
}
}