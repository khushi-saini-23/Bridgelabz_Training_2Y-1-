package Recursion.Strings;

public class RemoveCharacter {
    public static String remove(String str, char ch, int index) {
        if (index == str.length()) {
            return "";
        }
        char current = str.charAt(index);
        String result = remove(str, ch, index + 1);
        if (current == ch) {
            return result;
        }
        return current + result;
    }
    public static void main(String[] args) {
        String str = "banana";

        System.out.println(remove(str, 'a', 0));
    }
}
