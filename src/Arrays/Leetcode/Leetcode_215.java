package Arrays.Leetcode;

public class Leetcode_215 {
    public static int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums[nums.length - k];
    }
    public static void main(String[]args){
        int nums[]={3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(nums,k));
    }
}
