package Recursion.Strings;

public class PrintCharcter {

public static void print(String str, int index) {
    if (index == str.length()) {
        return;
    }
    System.out.println(str.charAt(index));
    print(str, index + 1);
}
public static void main(String[] args) {
    String str = "Java";

    print(str, 0);
}
}
