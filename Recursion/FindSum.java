// sum_of_digits;


import java.util.*;

public class FindSum
{
    public static int findsum(int n)
    {
        int result =0;
        if(n ==0)
        {
            return 0;
        }
        else
        {
             return (n%10)+findsum(n/10);
        }
    
    }

    public static void main(String[] args) 
    {
       
        int n =1234 ;
        int result = findsum(n);
        System.out.println("sum of number is: "+ result);

    }
}
