package Arrays.LogicBuilding;

import java.util.Scanner;
public class Calculator {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mod(int a,int b){
        return a%b;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you choice + ,-,%,/,*");
        char choice=sc.next().charAt(0);
        switch(choice){
            case '+':
                System.out.println("Addition is "+ sum(10,20));
                break;
            case '-':
                System.out.println("sub is "+ sub(10,20));
                break;
            case '%':
                System.out.println("mod is "+ mod(10,20));
                break;
            case '/':
                System.out.println("div is "+ div(10,20));
                break;
            case '*':
                System.out.println("mul is "+ mul(10,20));
                break;
            default:
                System.out.println("enter the valid element");
                break;

        }


    }
}
