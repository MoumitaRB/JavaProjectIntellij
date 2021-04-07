package test;

public class SwappingtwoNumbers {
    public static void main(String[] args) {
        int a=30;
        int b=20;
        int c=0;
        System.out.println("Before swipping numbers the value of a is: " +a);
        System.out.println("Before swipping numbers the value of b is: "+b);
        c=a;
        a=b;
        b=c;

        System.out.println("after swapping numbers the value of a is: "+ a);
        System.out.println("After swapping numbers the value of b is: "+ b);
    }
}
