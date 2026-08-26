package Arrays.LogicBuilding;

public class Sum_Of_Digits {
    public static int digits(int nums){
        int sum=0;
        while(nums!=0){
            sum+=nums%10;
            nums/=10;
        }
        return sum;
    }
    public static void main(String[]args){
        int nums=2434;
        System.out.println(digits(nums));
    }
}
