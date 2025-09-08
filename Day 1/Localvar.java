import java.util.*;

class Localvar {

    static int c=30;
    static int d=40;

    public void add() {
        int e=60, f=80;
        System.out.println("The addition of two numbers is " + (e+f));
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);

        Localvar obj = new Localvar();
        System.out.println(obj.c);
        System.out.println(obj.d);
        obj.add();
    }
}
