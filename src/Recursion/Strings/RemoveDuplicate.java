package Recursion.Strings;

public class RemoveDuplicate {
    public static String remove(String str, int index, String result) {
        if (index == str.length()) {
            return result;
        }
        char ch = str.charAt(index);

        if (result.indexOf(ch) == -1) {
            result = result + ch;
        }
        return remove(str, index + 1, result);
    }
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(remove(str, 0, ""));
    }
}
