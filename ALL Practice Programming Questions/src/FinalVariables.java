
public class FinalVariables {

	public static void main(String[] args) {
		
		int r = 20;
		final double pi = 3.14;
		double Area = pi*r*r;
		System.out.println(Area);
		
		
		AreaofRectangle();
		
		CheckingNumber(10 , 20);
		
		
		
		Array arr = new Array();
		arr.checkmonths();
		
		
		
		
		
		
		

	}
	
	static void AreaofRectangle(){
		
		int l ,b , area;
		l = 10;
		b = 20;
		area = l*b;
		System.out.println(area);
		
		
	}
	
	static void CheckingNumber(int x   , int y) {
		
		int flag = (x<10)? 0:1;
		if(flag==1) {
			System.out.println("Number is positive");
			
		}
		else {
			
			System.out.println("Number is negative");
			
			
		}
		
		
	}
	
	
	 static class Array{
		
		void checkmonths() {
			
			int days[];
			days = new int[5];
			days[0] = 31;
			days[1] = 30;
			days[2] = 28;
			days[3] = 30;
			days[4] = 31;
			
			System.out.println("January has " +days[0]+ "days");
			System.out.println("Februray has " +days[2]+ "days");
			
			
		}
	}
	 
	 
	
	

}


