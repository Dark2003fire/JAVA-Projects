import java.awt.List;
import java.util.*;

public class ControlFlowStatements {

	public static void main(String[] args) {
		
		
		Programforeachloop();
		
		DisplayTriangle();
		
		ForLoop nomstriangle = new ForLoop();
		nomstriangle.Numberstraingle();
		
		printtables();
		
		TriangleofNumbers();
		
		
		
		
		
		
			

	} 
	
	
	
	// @SuppressWarnings("unchecked") This is used to ignore the intellisence errors
	static void Programforeachloop() {
		
	//	@SuppressWarnings("rawtypes")
		
		/*
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
	
		System.out.println("List value is  = ");
		for(int  x : list) {
			
			System.out.print(x);
			System.out.print(",");
			
		}
		*/
		String [] names = {"Hitesh" , "Jha" , "Faizan" , "Hamza"};
		System.out.println("String array value is =");
		for(String name : names) {
			
			System.out.print(names);
			System.out.print(",");
			
			
		}
		
		
	   
	
		
		
		
		
	
}
	
       static void  DisplayTriangle()
	   {
		   
		   
		   for(int i = 1; i<=3 ;i++) {
			   
			   for(int j = 1;j<=i;j++ ) {
				   
				   System.out.println("*");
			   }
			   
			   System.out.println(" ");
		   }
	   
		   
			
			
	   }
      static  class ForLoop{
    	   
    	   void Numberstraingle(){
    		   
    		   for(int i =1;i<=3;i++) {
    			   
    			   for(int j=1;j<=i;j++) {
    				   System.out.println(i);
    				   
    			   }
    			   
    			   System.out.println();
    			   
    			   
    		   }
    		  
    	   }
       }
      
       static void printtables() {
    	   
    	   int i = 1; 
    	   int j = 1;
    	   
    	   System.out.println("Tables");
    	   while(i<=2) {
    		   
    		   while(j<=10) {
    			   
    			   
    			   System.out.println(i+"*"+j+"="+(i*j));
    			   j++;
    		   }
    		   
    		   i++;
    		   
    		   
    	   }
       }
       
       
       static void TriangleofNumbers() {
    	   
    	   int i = 1;
    	   int j = 1;
    	   do {
    		   
    		   int k = 5;
    		   do {
    			   
    			   System.out.print(" ");
    			   k--;
    			   
    		   }while(k>=i);
    		   
    		   j = 1;
    		   do {
    			   
    			   System.out.print(i+" ");
    			   j++;
    			   
    		   }while(j<=i);
    		  
    		  System.out.println("");
    		  i++;
    	   }
    	   while(i<=5);
    	   
       }
       
       
       
       
       
	
	
}


