package Recursion.Basic;

public class PrintNumber {
    public static void printDec(int n){
        //Increasing a Number
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        // Decreasing a Number
        if(n==1){
            System.out.print(n +" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[]args){
        printDec(10);
        printInc(10);
    }
}
