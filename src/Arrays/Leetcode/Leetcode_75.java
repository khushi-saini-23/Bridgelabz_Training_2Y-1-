package Arrays.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_75 {
    public static void  leetcode(int nums[]){
        for(int i=0;i<nums.length;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int []nums=new int[a];
        int n=nums.length;
        for(int i=0;i<a;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        leetcode(nums);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(nums));
    }
}
