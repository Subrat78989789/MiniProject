package Assingment;


import java.util.Scanner;

public class Test_Array_Operation extends Array_Operations {
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		
		
	
		

           
            
            Scanner sc=new Scanner(System.in);
            int choice;
            do {
            	 System.out.println("\n--- MENU ---");
                 System.out.println("1. Insert element");
                 System.out.println("2. Delete element");
                 System.out.println("3. Linear Search");
                 System.out.println("4. Binary Search");
                 System.out.println("5. Find Maximum");
                 System.out.println("6. Count Even and Odd");
                 System.out.println("7. Insertion Sort");
                 System.out.println("8. Display Array");
                 System.out.println("9. Exit");
                 
                 System.out.print("Enter your choice: ");
             choice = sc.nextInt();
             switch (choice) {
             case 1: 
             	Insertion(a);
             	break;
             case 2: Deletion(a);
                 break;
             case 3: linear_search(a);
                 break;
             case 4:Binary_search(a);
                 break;
             case 5: maximum_value(a);
                 break;
             case 6: count_even_odd(a);
                 break;
             case 7: Insertion_sort(a);
                 break;
             case 8:Traverse(a);
                break;
             case 9:
             	System.out.println("Exiting program..."); 
             	break;
             default: 
             	System.out.println("Invalid choice!");
         
		
            }
            }
          while(choice!=9);
	}
}
          
          

		
	


