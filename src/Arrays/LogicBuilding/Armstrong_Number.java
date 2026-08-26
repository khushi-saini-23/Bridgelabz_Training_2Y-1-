package Arrays.LogicBuilding;

import java.util.Scanner;

public class Armstrong_Number {
    public static int count(int n){
        int count =0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count ;
    }
    public static boolean Armstrong(int n){
        int ori=n;
        int d=count(n);
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=(int)Math.pow(rem,d);
            n/=10;
        }
        if(sum==ori){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(Armstrong(a)){
            System.out.println("Is ArmsStrong "+a);
        }else{
            System.out.println("Is not ArmStrong "+a);
        }
    }
}
