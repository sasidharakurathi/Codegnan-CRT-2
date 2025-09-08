//  Write a java program to swap given two numbers using third variable

public class Swap1 {
    public static void main(String[] args) {
        int a=10,b=20,temp;

        // a,b before swapping
        System.out.println("Before Swapping: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        // Swapping using third variable (temp)
        temp = a;
        a = b;
        b = temp;

        // a,b after swapping
        System.out.println("After Swapping: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);


    }
}