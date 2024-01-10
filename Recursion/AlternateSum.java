//

import java.util.*;

/**
 * AlternateSum
 */
public class AlternateSum
{
    public static int FindSum(int n)
    {
        if(n ==0)
        {
            return 0;
        }
        else{
            if(n%2==0)
            {
                return FindSum(n-1)-n;
            }
            else
            {
                return  FindSum(n-1)+n;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int result = FindSum(n);
        System.out.println("sum of Alternate number is: " + result);
    }

    
}