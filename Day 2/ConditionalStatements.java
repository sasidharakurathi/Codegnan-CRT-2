
public class ConditionalStatements {
    
    static void ifEx() {
        int a=20;
        System.out.println("Simple if: ");
        if(a%2==0) {
            System.out.println("a is even");
        }
    }
    
    static void ifElseEx() {
        int a=21;
        System.out.println("if-else: ");
        if(a%2==0) {
            System.out.println("a is even");
        } else {
            System.out.println("a is odd");
        }
    }
    
    static void ifElseIfEx() {
        int a=90,b=70,c=50;
        System.out.println("if-else-if: ");
        if ((a>b) && (b>c)) {
            System.out.println("a is big");
        } else if((b>a) && (a>c)) {
            System.out.println("b is big");
        } else {
            System.out.println("c is big");
        }

    }

    public static void main(String[] args) {
        ifEx();
        ifElseEx();
        ifElseIfEx();
    }    
}
