package Recursion.Basic;
import java.util.*;
public class EuclideanAlgo {
    public static int gcd(int x,int y) {
        if (y == 0) {
            return x;
        }
        int value = gcd(y, x % y);
        return value;

    }
     public static int lcm(int x,int y){
        return (x/gcd(x,y))*y;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value 1");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Enter the value 2");
        System.out.println(gcd(x,y));
        System.out.println(lcm(x,y));
    }
}
