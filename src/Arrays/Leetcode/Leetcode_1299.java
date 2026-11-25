package Arrays.Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_1299 {
    public static int[] replaceElements(int[] nums) {
        int max=-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>max){
                int temp=max;
                max=nums[i];
                nums[i]=temp;
            }else{
                nums[i]=max;
            }
        }
        return nums;
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
        System.out.println(Arrays.toString(replaceElements(nums)));
    }
}
