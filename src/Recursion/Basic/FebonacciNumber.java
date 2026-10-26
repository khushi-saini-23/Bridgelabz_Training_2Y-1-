package Recursion.Basic;

public class FebonacciNumber {
    public static int fact(int n,int i) {
        if(i>n){
            return 0;
        }

        return i+fact(n,i+1);
    }
    public static void main(String[]args){
        System.out.println(fact(5,1));
    }

    // it's will be return position

//        if (n == 0 || n == 1) {
//            return n;
//        }
//        int small1 = fact(n - 1);
//        int small2 = fact(n - 2);
//        return small1 + small2;
//    }
//    public static void main(String[]args){
//        System.out.println(fact(5));
//    }
}
