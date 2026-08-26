package Arrays.LogicBuilding;

import java.util.Scanner;
public class Febonacci_series {
    public static int series(int nums){
        int first=0;
        int second=1;
        for(int i=2;i<=nums;i++){
            int temp=first+second;
            first=second;
            second=temp;
        }
        return first;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        System.out.println(series(nums));
    }
}
