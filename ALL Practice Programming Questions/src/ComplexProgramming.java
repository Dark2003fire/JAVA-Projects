import java.util.*;
public class ComplexProgramming {

	public static void main(String[] args) {
		
		FactorialNumbers();
		ArmstrongNumber();
		FloydTriangle();
		
		
		
			

	}
	static void FactorialNumbers() {
		
		int n , c , fact =1;
		System.out.println("Enter an integer to calculate it's factoraial\n");
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		if(n<0)
			System.out.println("Numbers should be non-negative");
		else
			for(c=1;c<=n;c++)
				fact = fact*c;
		System.out.println("Factorial  of " +n+ " is = "+fact);
		
		
	}
	static void ArmstrongNumber() {
		
		int  n  , temp , digits=0 , remainder , Sum = 0;
		
		System.out.println("Input a number to check if it is an armstrong number or not");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		temp = n;
		while(temp!=0) {
			digits++;//Count the nos of digits ;
			temp = temp/10;
			
			
		}
		temp =n;
		while(temp!=0) {
			
			remainder = temp%10;
			Sum = Sum+Power(remainder , digits);
			temp = temp/10;
			
		}
		if(n == Sum) {
			
			System.out.println(n +"is an Armstrong Number");
			
		}
		else {
			
			System.out.println(n+"is not an Armstrong Number");
			
		}
		
		
		
		
		
	}//What the fuck logic I'm writing ["_"]
	static int Power(int n , int r) {
		
		int c   ,  p = 1;
		for(c=1; c<=r;c++) {
			
			p=p*n;
			return p;
			
		}
		return p;
		
		
	}
	
	static void   FloydTriangle(){
		
		int x ;
		System.out.println("Input a number to check it is even or odd");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		
		if(x%2==0) {
			System.out.println("Number is even");
			
		}
		else {
			System.out.println("Number is ODD");
			
		}	
	}	
	
}
