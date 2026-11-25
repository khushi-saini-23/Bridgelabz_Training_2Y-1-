package Arrays.Leetcode;

import java.util.Scanner;

public class Leetcode_1464 {
    public static int leetCode(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return (nums[n - 1] - 1) * (nums[n - 2] - 1);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int []nums=new int[a];
        int n=nums.length;
        for(int i=0;i<a;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(leetCode(nums));

    }
}
