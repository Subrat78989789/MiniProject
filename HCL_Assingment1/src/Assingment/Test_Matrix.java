package Assingment;

public class Test_Matrix extends Matrix_Operations {
	public static void main(String[] args) {
		int a[][]= {{1,2,9},{3,4,8},{4,9,2}};
		int b[][]= {{5,6,8},{7,8,4},{1,2,3}};
		
		if(a.length==b.length &&a[0].length==b[0].length)
		{
		System.out.println("Matrix Addition:");
		int add[][]=matrix_addition(a, b);
		traverse(add);
		}
		else {
			System.out.println("Matrix Addition is not possible");
		}
		

		System.out.println();
		if(a.length==b.length &&a[0].length==b[0].length)
		{
		System.out.println("Matrix Subtraction:");
		int sub[][]=matrix_subtraction(a, b);
		traverse(sub);
		}
		else {
			System.out.println("Matrix Subtraction is not possible");
		}
		
		System.out.println();
		int aa[][]= {{1,2,9},{3,4,8}};
		int bb[][]= {{5,6,8},{7,8,4},{1,2,3}};
		System.out.println("Matrix Multiplication:");
		int multiplication[][]=matrix_muliplication(aa, bb);
		traverse(multiplication);
		System.out.println();
		System.out.println("Matrix Transpose: ");
		int transpose[][]=matrix_transpose(aa);
		traverse(transpose);
		
		System.out.println();
		System.out.println("Matrix is Square or Not= "+(check_square_matrix(a)?"Yes Matrix is Square":"Mathrix is not square"));
		
		int g[][]= {{1,0,0},{0,2,0},{0,0,3}};
		System.out.println();
		System.out.println("Matrix is Diagonal_Matrix or not= "+(check_diagonal_matrix(g)?"Yes Matrix is Diagonal":"Matrix is not diagonal"));
		
		int h[][]= {{1,0,0},{0,1,0},{0,0,1}};
		System.out.println();
		System.out.println("Matrix is Identity_Matrix or not= "+(check_Identity_matrix(h)?"Yes Matrix is Identity Matrix":"Matrix is not Identity Matrix"));
				
		
		
		
		
		
		
		
		
			}

}
