import java.io.*;
import java.util.*;

public class Ages_Problem {
	
	public static void Main(String[]args) {
		
		Demo dm = new Demo();
		dm.Ages_Read_info();
		
		
	}
	

	
	

}
class Demo{
	
	void Ages_Read_info() {
		
		int smallest =0;
		int largest = 0;
		int age;
		
		System.out.println("Enter the number of members in the family");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Enter the ages of the family members");
		age = input.nextInt();
		smallest = age;
		for(int i = 1;i<n;i++) {
			
			System.out.println("Enter the ages of family member");
			age = input.nextInt();
			if(age>largest) {
				largest = age;
			}
			if(age<smallest) {
				smallest = age;
				
			}
			
		}
		System.out.println("Eldest age is "+largest);
		System.out.println("Youngest age is "+smallest);
		
	}
}