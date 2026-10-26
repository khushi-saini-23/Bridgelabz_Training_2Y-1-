package Recursion.Arrays;

public class PrintArrays {
    public static void printDec(int arr[],int index){
        if(index==arr.length){
            return;
        }
        printDec(arr,index+1);
        System.out.print(arr[index]+" ");
    }
    public static void printInc(int arr[],int index){
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        printInc(arr,index+1);
    }
    public static void main(String[]args){
        int []arr={3,55,66,21,76,87};
        printDec(arr,0);
        System.out.println();
        printInc(arr,0);
    }
}
