/*
    write a java program to print the 
        a. area of the triangle     (0.5*base*height)
        b. area of the rhombus      (0.5*diagonal1*diagonal2)
        c. area of the trapezium    (height*0.5*(a+b))
*/

public class Area {
    
    static double areaOfTriangle(int base, int height) {
        return 0.5*base*height;
    }

    static double areaOfRhombus(int d1, int d2) {
        return 0.5*d1*d2;
    }

    static double areaOfTrapezium(int height, int a, int b) {
        return 0.5*height*(a+b);
    }
    
    public static void main(String[] args) {
        // Triangle base and height values
        int base=10, height=20;

        // Rhombus 1st diagonal and 2nd diagonal values
        int diagonal1=10, diagonal2=20;

        // Trapezium height, a and b values
        int tHeight=10,a=2,b=3;

        System.out.println("Area of triangle: " + areaOfTriangle(base,height));
        System.out.println("Area of rhombus: " + areaOfRhombus(diagonal1,diagonal2));
        System.out.println("Area of trapezium: " + areaOfTrapezium(tHeight, a, b));
    }
}
