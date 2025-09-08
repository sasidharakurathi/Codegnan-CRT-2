import java.util.*;

class Variables {

    // Static Variables (Also Global Variables)
    static int c=30;
    static int d=40;

    void add() {
        int e=60, f=80;
        System.out.println("The addition of two numbers is " + (e+f));
    }

    void sub() {
        System.out.println("The subtraction is " + (c-d));
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

        // Instance Variable
        Variables obj = new Variables();

        // Accessing Static Variables
        System.out.println(Variables.c);
        System.out.println(Variables.d);
        obj.add();
        obj.sub();

        final int c=10;
        System.out.println(c);
    }
}
