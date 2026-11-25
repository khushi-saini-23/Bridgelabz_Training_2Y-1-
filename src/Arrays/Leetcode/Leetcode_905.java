package Arrays.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_905 {
    public static int[] leetcode(int nums[]){
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int temp=nums[a];
                nums[a]=nums[i];
                nums[i]=temp;
                a++;
            }
        }
        return nums;
    }

    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int []nums=new int[a];
        int n=nums.length;
        for(int i=0;i<a;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        leetcode(nums);
        System.out.println("After sorting: "+Arrays.toString(nums));
    }
}
