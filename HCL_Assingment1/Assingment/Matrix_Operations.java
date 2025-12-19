package Assingment;

import org.w3c.dom.ls.LSOutput;

public class Matrix_Operations {
	
	public static int[][] matrix_addition(int a[][],int b[][])
	{
	
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				
			}
		}
		
		
		return c;
		
	}
	public static int[][] matrix_subtraction(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				
			}
		}
		return c;
	}
	public static int[][] matrix_muliplication(int a[][],int b[][])
	{
		//
		
		int c[][]=new int[a.length][b[0].length];//this dimension is according to multiplication rule of matrix we know that from matrix multiplication matrixA column and matrixB row should be equal and the new dimension of new matrix will be (matrixA row*matrixB column) 
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)// or j<b.length
			{
				for(int k=0;k<a[0].length;k++)//or k<b.length
				{
					 c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
				
				
			}
		}
		return c;
	}
	
	public static int[][] matrix_transpose(int a[][])//Make Rows to column
	{
		int c[][]=new int[a[0].length][a.length];//no.of rows of MatrixA is no. of coiumns of MatrixC
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				c[j][i]=a[i][j];
			//	System.out.print(c[i][j]);
				
				
			}
			
		}
		return c;
	}
	public static boolean check_square_matrix(int a[][])//Make Rows to column
	{
	if(a[0].length==a.length)
	{
		return true;
	}
	return false;
		
	}
	
	public static boolean check_diagonal_matrix(int a[][])//All non diagonal elements should be zero.All diagonal elements may be zero/nonzero.
	{
	if(check_square_matrix(a))//First check matrix is square or not
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i!=j)
				{
					if(a[i][j]!=0)
					{
					
						return false;
					}
					}
				}
		}
		return true;
		
	}
	else {
		return false;
	}
		
	}
	
	
	public static boolean check_Identity_matrix(int a[][])//All non diagonal elements should be zero.All diagonal elements should be 1.
	{
	if(check_square_matrix(a))//First check matrix is square or not
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i!=j)
				{
					if(a[i][j]!=0)
					{
					
						return false;
					}
					}
				if(i==j)
				{
					if(a[i][j]!=1)
					{
						return false;
					}
					
				}
				}
		}
		return true;
		
	}
	else {
		return false;
	}
		
	}
	
	
	public static void traverse(int c[][])
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
			System.out.print(c[i][j]+" ");	
			
			}
			System.out.println();
		}
	}

}
