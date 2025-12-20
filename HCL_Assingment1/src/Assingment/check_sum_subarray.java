//check is any sum of sub array is equal to given key value(k) or not.
package Assingment;
import java.util.HashMap;
import java.util.HashSet;

public class check_sum_subarray {
    public static void main(String[] args) {
        int a[]={2,8,2,6,-6,3,2};
        int k=5;
        boolean found=checksumsuarray(a,k);
        System.out.print(found);
    }
    public static boolean checksumsuarray(int a[],int k) 
    {
       
        HashSet<Integer> my=new HashSet<>();
        my.add(0);//to handle x==k case
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
            int remsum=sum-k;
            if(my.contains(remsum))
            {
                return true;
             
            }
            my.add(sum);//this behaves like it is in else case
        }
        return false;
       
        
    }
    
}
