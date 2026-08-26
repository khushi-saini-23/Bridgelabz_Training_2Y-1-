package Arrays.LogicBuilding;

import java.util.Scanner;
public class Prime {
    public static boolean primenumber(int nums){
        if(nums<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(nums);i++){
            if(nums%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        System.out.println(primenumber(nums));
    }
}
