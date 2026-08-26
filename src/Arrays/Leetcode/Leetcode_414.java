package Arrays.Leetcode;

public class Leetcode_414 {
    public static int third_Max_Number(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[i] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
        }
        int count=1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            if(count==3){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];


    }
    public static void main(String[]args){
        int nums[]={3,2,1};
        System.out.println(third_Max_Number(nums));

    }
}
