package Arrays.Leetcode;

import java.util.Arrays;

public class Leetcode_1929 {
    public static int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int answer[]=new int[2*n];
        for(int i=0;i<answer.length;i++){
            answer[i]=nums[i%nums.length];

        }
        return answer;
    }
    public static void main(String[]args){
        int nums[]={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
