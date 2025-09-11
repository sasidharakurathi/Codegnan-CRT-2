public class Loops{

	static void whileLoop(){
		int n = 5432;
		System.out.println("n = "+n);

		int sum = 0;

		while(n>0){
			sum+=n%10;  // For Reverse of the number - " sum*=10+n%10 " 
			n/=10;
		}

		System.out.println("Sum of digits of n is "+ sum);

	}

	static void doWhileLoop(){
		int n = 5432;
		System.out.println("n = "+n);

		int sum = 0;

		do{
			sum+=n%10;
			n/=10;
		}while(n>0);

		System.out.println("Sum of digits of n is "+ sum);

	}

    static void forLoop() {
        
    }

	

	public static void main(String []args){
		whileLoop();
		doWhileLoop();
        forLoop();
	}
}