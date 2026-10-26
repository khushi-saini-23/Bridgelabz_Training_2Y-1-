package Recursion.Strings;

public class WordPrint {
    public static void print(String word, int index){
        if(index==word.length()){
            return ;
        }
        char value=word.charAt(index);
        System.out.print(value);
        print(word,index+1);
    }
    public static void decPrint(String word,int index){
        if(index==word.length()){
            return ;
        }
        decPrint(word,index+1);
        System.out.print(word.charAt(index));
    }
    public static void main(String[]args){
        String word="hello";
        print(word,0);
        System.out.println();
        decPrint(word,0);
    }
}
