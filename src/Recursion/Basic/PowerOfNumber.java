package Recursion.Basic;
import java.util.*;
public class PowerOfNumber {
    public static int powerNumber(int p,int q){
        if(p==0){
            return 1;
        }
        return q*(powerNumber(p-1,q));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of p");
        int p=sc.nextInt();
        System.out.println("Enter the value of q");
        int q=sc.nextInt();
        System.out.println(powerNumber(p,q));
    }

}
