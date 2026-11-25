package Arrays.Sliding_Window;

import java.util.Scanner;

public class Leetcode_643 {
    public static double maxAverage(int[] nums,int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = sum;
        for (int i = 1; i <= nums.length - k; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            max = Math.max(sum, max);
        }
        return (double) max / k;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of K");
        int k=sc.nextInt();
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(maxAverage(nums,k));
    }

}
