package Arrays.Sliding_Window;

import java.util.Scanner;

public class MaxSum {
    public static int maxSum(int nums[],int size){
        int sum=0;
        int maxSum=0;
        for(int i=0;i<size;i++){
            sum=sum+nums[i];
        }
        maxSum=sum;
        for(int i=size;i<nums.length-size;i++){
            sum = sum - nums[i - size] + nums[i];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Size");
        int size=sc.nextInt();
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(maxSum(nums,size));
    }
}
