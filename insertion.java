import java.util.Scanner;

public class insertion
{
    public static void sort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int j=i;
            while (j>0 && a[j]>a[j-1]) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }

    }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the aay size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the aay elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        sort(arr);
        System.out.println(" Sorted array is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
