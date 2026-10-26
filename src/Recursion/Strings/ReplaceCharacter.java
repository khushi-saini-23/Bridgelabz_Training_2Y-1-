package Recursion.Strings;

public class ReplaceCharacter {
    public static String replace(String str, int index) {
        if (index == str.length()) {
            return "";
        }
        char ch = str.charAt(index);

        if (ch == 'a') {
            ch = 'b';
        }
        return ch + replace(str, index + 1);
    }
    public static void main(String[] args) {
        String str = "banana";
        System.out.println(replace(str, 0));
    }
}
