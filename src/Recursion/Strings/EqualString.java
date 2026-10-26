package Recursion.Strings;

public class EqualString {
    public static boolean check(String s1, String s2, int index) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (index == s1.length()) {
            return true;
        }
        if (s1.charAt(index) != s2.charAt(index)) {
            return false;
        }
        return check(s1, s2, index + 1);
    }
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(check(s1, s2, 0));
    }
}
