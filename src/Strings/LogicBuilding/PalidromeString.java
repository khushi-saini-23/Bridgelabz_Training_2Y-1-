package Strings.LogicBuilding;

import java.util.Scanner;

public class PalidromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :-");
        String word = sc.nextLine();
        String result = new StringBuilder(word).reverse().toString();
        if (word.equals(result)) {
            System.out.println(word+" It's palidrome");
        } else {
            System.out.println(word+" It's not a palidrome");
        }
    }
}

