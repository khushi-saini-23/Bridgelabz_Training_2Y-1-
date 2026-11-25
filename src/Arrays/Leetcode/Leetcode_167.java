package Arrays.Leetcode;
import java.util.*;
public class Leetcode_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum>target){
                end--;
            }else if(sum<target){
                start++;
            }else{
                return new int[]{start+1,end+1};
            }
        }
        return new int[]{-1,1};

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(twoSum(nums,target));
    }
}
