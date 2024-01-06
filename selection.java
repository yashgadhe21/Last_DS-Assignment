import java.util.Arrays;
import java.util.Scanner;

public class selection
{ 
    public static void sort(int a[])
    {
        for(int i =0;i<a.length-1;i++)
        {
            int min_indx = i;
            for(int j = i+1;j<a.length;j++)
            {
                if(a[j] > a[min_indx])
                {
                    min_indx = j;
                }
            }
           if(min_indx != i)
           {
            int temp = a[min_indx];
            a[min_indx] = a[i];
            a[i] = temp;
           }

        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of Arrays");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i=0;i<arr.length;i++)
        {   
            System.out.print(arr[i] + " ");
        }
    }
    
}
