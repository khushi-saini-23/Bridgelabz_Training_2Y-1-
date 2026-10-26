package Recursion.Arrays;
import java.util.*;
public class ArrayMax {
    public static int max(int []arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int small=max(arr,index+1);
        return Math.max(small,arr[index]);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[0]=sc.nextInt();
        }
        System.out.print("Max Element:- ");
        System.out.println(max(arr,0));
    }

}
