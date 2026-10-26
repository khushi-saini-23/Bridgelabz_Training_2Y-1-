package Recursion.Basic;
import java.util.*;
public class PrintName {
        public static void printNumber(int n,int i){
            if(i>n){
                return;
            }
            System.out.println("Khushi");
            printNumber(n,i+1);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            printNumber(n,1);

        }
    }
