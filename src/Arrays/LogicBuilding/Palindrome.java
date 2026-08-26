package Arrays.LogicBuilding;

import java.util.Scanner;
public class Palindrome {
    public static boolean checkpalindrome(int nums){
        int ori=nums;
        int rev=0;
        while(nums!=0){
            int d=nums%10;
            rev=(rev*10)+d;
            nums/=10;
        }
        return ori==rev;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int nums=sc.nextInt();
        if(checkpalindrome(nums)){
            System.out.println("Its a palidorme");
        }else{
            System.out.println("not a palidrome");
        }
    }
}
