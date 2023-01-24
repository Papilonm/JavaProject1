package Project;

public class Task6 {
    //  6)Write a program to swap 2 numbers without a temporary variable?

    public static void main(String[] args) {
        int a=10;
        int b=20;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
