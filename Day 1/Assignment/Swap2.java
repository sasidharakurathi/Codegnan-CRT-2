//  Write a java program to swap given two numbers without using third variable

public class Swap2 {
    public static void main(String[] args) {
        int a=10,b=20;
        
        // a,b before swapping
        System.out.println("Before Swapping: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        // Swapping without using third variable (temp)
        a = a+b;
        b = a-b;
        a = a-b;

        // a,b after swapping
        System.out.println("After Swapping: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
