package Recursion.Arrays;
import java.util.*;
public class SearchTarget {
    public static int indexSearch(int arr[],int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return indexSearch(arr,index+1,target);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int target= sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[0]=sc.nextInt();
        }
        System.out.println(indexSearch(arr,0,target));
    }

}
