package Arrays.LogicBuilding;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void removeElement(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[j] = -1;
                }
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != -1) {
                System.out.print(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter " +size+ " elements:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        removeElement(nums);
    }
}