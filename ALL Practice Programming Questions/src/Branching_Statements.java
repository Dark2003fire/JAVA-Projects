
public class Branching_Statements {

	public static void main(String[] args) {
		
	BreakStatements();
	ContinueStatements();
	
		
		
	

	}
	
	 static void BreakStatements() {
		
		boolean t = true;
		
		a:{
			b:{
				c:{
					
					System.out.println("Before the break");
					if(t)
						break b;
					System.out.println("This will not execute");
				}
				if(t)
					break a;
				
				
				System.out.println("Even this will not execute ");
			}
			System.out.println("This is after b");
			
		}
	}
	 
	 static void ContinueStatements() {
		 
		 for(int i = 1;i<=10;i++) {
			 if(i%2==0)//program to print the odd nos;
				    continue;
			 System.out.println(i);
			
		 }
		 for(int j =1 ; j<=10;j++) {
			 
			 if(j%2==1)//program to print the even nos;
				 continue;
			 System.out.println(j);
			 
		 }
	 }
	 
	 static void ReturnStatements() {
		 
		 boolean t = true;
		 System.out.println("Before the return");
		 if(t)
			 return;
		 System.out.println("This Won't execute");
		 
	 }
	
	 
	

}
