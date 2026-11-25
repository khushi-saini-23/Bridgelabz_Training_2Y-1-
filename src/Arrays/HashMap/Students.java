package Arrays.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Students {
    public static void main(String[]args){
        HashMap<String,Integer> student=new HashMap<>();           // Using HashMap
        student.put("Rahul",21);
        student.put("Mayank",22);
        student.put("Ayushi",20);
        System.out.println("List of the student name :- "+student);
        System.out.println("Ayushi age : "+student.get("Ayushi"));
        System.out.println("Mayank age : "+student.get("Mayank"));
        System.out.println("Rahul age : "+student.get("Rahul"));
        boolean hasMayank=student.containsKey("Mayank");
        boolean hasAge20=student.containsValue(20);
        System.out.println(" is Mayank name is present "+hasMayank);
        System.out.println(" has age 20 "+hasAge20);


//        Object arr[]={11,1.1,"a",'A'};
//        List list=new ArrayList<>();
//        for(Object i: arr)
//        {
//            list.add(i);
//        }
//        System.out.println(list);


    }
}
