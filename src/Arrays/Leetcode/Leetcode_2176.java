package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_2176 {
    public static int countPairs(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((i*j)%k==0 && nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the element of the Array");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(countPairs(nums,k));
    }
}
