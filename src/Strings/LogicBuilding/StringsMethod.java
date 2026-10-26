package Strings.LogicBuilding;

public class StringsMethod {
    public static void main(String[]args){

        //StringBuilder
        StringBuilder sb=new StringBuilder();
        String word="Khushi";
        sb.append(" Saini");
        System.out.println("Append" +sb);
        sb.reverse();
        System.out.println("Reverse "+sb);
        sb.insert(3,"hi");
        System.out.println("Insert "+sb);
        sb.capacity();
        System.out.println("capacity "+sb);
        sb.delete(0,5);
        System.out.println("Capacity "+sb);

        // StringBuffer
        StringBuffer s1=new StringBuffer();
        String str="Hello World";
        s1.append("Append "+str);
        System.out.println(s1);
        s1.deleteCharAt(4);
        System.out.println(s1);
        s1.replace(0,3,"hey");
    }
}
