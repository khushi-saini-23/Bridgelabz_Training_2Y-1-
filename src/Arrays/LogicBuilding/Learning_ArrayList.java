package Arrays.LogicBuilding;

import java.util.ArrayList;
import java.util.Arrays;

public class Learning_ArrayList {
    public static void main(String[]args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0,2);
        list.add(1,4);
        list.add(2,6);
        list.add(3,8);
        list.add(3,7);
        System.out.println(list);
        int nums[]=new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        System.out.println(" We have converted the Arraylist into Arrays");
        System.out.println(Arrays.toString(nums));

    }

}


