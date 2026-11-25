package Arrays.Sliding_Window;

import java.util.Scanner;

public class Leetcode_1343 {
    public static int numOfSubarrays(int[] arr, int k, int th) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        if (sum / k >= th) {
            count++;
        }
        for (int i = 1; i <= arr.length - k; i++) {
            sum = sum - arr[i - 1] + arr[i + k - 1];
            if (sum / k >= th) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of K");
        int k=sc.nextInt();
        System.out.println("Enter the threshold");
        int th=sc.nextInt();
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(numOfSubarrays(arr,k,th));
    }
}
