package Strings.LogicBuilding;

import java.util.Arrays;

public class moveZeros {
    public static int[] movezero(int nums[]) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }

        }
        return nums;
    }
       public static void main(String[]args){
           int nums[]={1,0,8,0,4,0};
           System.out.println(Arrays.toString(movezero(nums)));
       }
}
