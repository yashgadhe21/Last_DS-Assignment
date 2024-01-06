import java.util.Scanner;
import java.io.*;

public class bublleS {

    public static void sort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if(a[j] < a[j + 1]) {
                    swapped = true;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }
            }
                if (!swapped) {
                    return;
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
        System.out.println(" Sorted aay is :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}