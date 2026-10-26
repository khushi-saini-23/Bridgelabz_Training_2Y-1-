package Recursion.Strings;

public class StringLength {
    public static int count(String str, int index) {
        try {
            str.charAt(index);
            return 1 + count(str, index + 1);
        } catch (StringIndexOutOfBoundsException e) {
            return 0;
        }
    }
    public static void main(String[] args) {
        String str = "Java";

        System.out.println(count(str, 0));
    }
}
