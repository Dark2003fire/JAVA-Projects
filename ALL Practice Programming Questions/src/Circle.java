import java.io.*;
class MyCircle{
	
	int radius;
	float perimeter;
	float area;
	
}

public class Circle {

	private Object radius;
	private Object area;
	final static float pi = 3.14f;
	
	

public static void main(String[] args) {
		
		
		final float radius = 90;
		
		Circle c = new Circle();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Radius");
		try {
			c.radius = Integer.parseInt(in.readLine());
			float pi = 3.14f;
			
		}
		catch(IOException ioe) {
			
			c.area = pi*(float)(radius*radius);
			System.out.println("Perimeter :"+c.radius);
			System.out.println("Area:"+c.area);
					
		}		

	}	

}
