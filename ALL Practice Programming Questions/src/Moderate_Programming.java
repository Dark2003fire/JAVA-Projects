import java.util.*;
public class Moderate_Programming {

	public static void main(String[] args) {
		
		FlyodTriangle(5);
		PrimeNumber1();
		PrimeNumber2();
		
		
		
		
		

	}
	
	static void FlyodTriangle(int n ) {
		
		int i   ,  j , val =1 ;
		for(i=1;i<n;i++) {
			for(j =1 ;j<=i;j++) {
				
				System.out.println(val+"");
				val++;
				
			}
			
			System.out.println();
			
			
			
		}
	}
	 static void  PrimeNumber1(){
			
			int  num ;
			int count;
			
			System.out.println("Enter the numeber till which you want to print the prime numbers:-");
			Scanner in = new Scanner(System.in);
			num = in.nextInt();
			
			
			for(int i =1 ;i<num;i++) {
				count = 0;
				
				
				
				for(int j = 2 ;j<i/2;j++) {
					
					if(i%j==0) {
						count++;
						break;
						
					}				
					
				}
				if(count==0) {
					System.out.println(i);
					
				}
				
			}
			
			
		}
	 
	 static void PrimeNumber2() {
		 
		 int n  ,  status = 1 ,  num =1 ;
		 
		 System.out.println("Enter the number of prime number you want");
		 Scanner in = new Scanner(System.in);
		 n = in.nextInt();
		 
		 if(n>=1) {
			 System.out.println("First"+n+"prime numbers are:-");
			 System.out.println(2);
			 
		 }
		 for(int count = 2;count<=n;) {
			 
			 for(int j = 2 ; j<=Math.sqrt(num);j++) {
				 
				 if(num%j==0) {
					 status = 0;
					 break;
					 
				 }
			 }
			 if(status!=0) {
				 System.out.println(num);
				 count++;
				 
			 }
			 status = 1;
			 num++;
			 
		 }
	 }

}


