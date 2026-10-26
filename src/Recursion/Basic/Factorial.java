package Recursion.Basic;

public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int small=fact(n-1);
        return small*n;
    }
    public static void main(String[]args){
        System.out.println("The Factorial of a Number is:- ");
        System.out.print(fact(5));
    }
}
