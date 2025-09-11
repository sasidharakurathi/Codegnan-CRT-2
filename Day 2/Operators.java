public class Operators {

    static void arithOp() {
        int a=20,b=5;
        System.out.println("Arithmetic Operators: ");
        System.out.println("The addition of two numbers is: " + (a+b));
        System.out.println("The subtraction of two numbers is: " + (a-b));
        System.out.println("The multiplication of two numbers is: " + (a*b));
        System.out.println("The division of two numbers is: " + (a/b));
        System.out.println("The modulus of two numbers is: " + (a%b));
    }
    
    static void realOp() {
        int a=40,b=6;
        System.out.println("Relational Operators: ");
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
    
    static void logicalOp() {
        int a=60,b=20,c=70;
        System.out.println("Logical Operators: ");
        System.out.println((a>b)&&(c<b));   // false
        System.out.println((a>b)||(c<b));   // true
        System.out.println(!(a>b));   // false
    }

    static void assignmentOp() {
        int a=20,b=30,c=5;
        System.out.println("Assignment Operators: ");
        a=b;
        System.out.println(a);
        c+=5;
        System.out.println(c);
        a*=6;
        System.out.println(a);
    }
    
    static void ternaryOp() {
        int a=20,b=30;
        System.out.println("Ternary Operator: ");
        System.out.println((a>b) ? a: b);

    }

    static void incrementOp() {
        int a=20;
        System.out.println("Increment Operator: ");
        System.out.println("Post Increment: " + a++);
        System.out.println("Pre Increment: " + ++a);
    }

    static void decrementOp() {
        int a=20;
        System.out.println("Decrement Operator: ");
        System.out.println("Post Decrement: " + a--);
        System.out.println("Pre Decrement: " + --a);
    }

    public static void main(String[] args) {
        arithOp();
        realOp();
        logicalOp();
        assignmentOp();
        ternaryOp();
        incrementOp();
        decrementOp();
    } 
}
