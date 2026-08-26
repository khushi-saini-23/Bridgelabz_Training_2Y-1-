package Arrays.Leetcode;

public class Leetcode_977 {
        public static int[] sortedSquares(int[] nums) {
            int[] s = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                s[i] = nums[i] * nums[i];
            }
            for (int i = 1; i < nums.length; i++) {
                for (int j = 0; j < nums.length - 1; j++) {
                    if (nums[i] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }

                }
            }
            return s;
        }
        public static void main(String[]args){
            int nums[]={-4,-1,0,3,10};
            System.out.println (sortedSquares(nums));
        }
    }
