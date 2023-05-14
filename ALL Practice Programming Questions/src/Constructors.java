
class  Area_of_Rectangle{
	
	int length , breadth;
	
	
	Area_of_Rectangle(){
		
		length = 20;
		breadth = 30;
		
		
	}
	
	void calculate() {
		
		 int area;
		 area = length* breadth;
		 
		 System.out.println("The area of rectangle is"+area);
		
		 
	}
	
	
	
}
public class Constructors {

	public static void main(String[] args) {
		
		Employee Emp = new Employee();
		Employee Emp2 = new Employee();
		
	    Emp2.setdata(2, "Tushar Sathe", 25360000.00f);
		Emp.setdata(1, "Hitesh", 253612.365f);
		Emp.Display();
		Emp2.Display();
		
		
		Area_of_Rectangle aor = new Area_of_Rectangle();
		aor.calculate();
		
		
		
		//Default Constructor:-->
		int Total1, Total2 , GrandTotal;
		Default_Constructor_Student_info Dcsi = new Default_Constructor_Student_info();
		Total1=Dcsi.Total();
		Total2 = Dcsi.Total();
		GrandTotal = Total1+Total2;
		Dcsi.Display_Result();
		Default_Constructor_Student_info student = new Default_Constructor_Student_info();
		student.Display_Result();
		System.out.println("GrandTotal is "+GrandTotal);
		
		

		//Parameterised Constructor:-->
		Student_info std1 = new Student_info(8865 , 35, 15);
		Student_info std2 = new Student_info(8801 , 50  ,50);
		int total1 = std1.total();
		int total2 = std2.total();
		int grandtotal = total1+total2;
		std1.displayinfo();
		std2.displayinfo();
		System.out.println("Grandtotal is :"+grandtotal);
		
		
		
		
		
		
		

	}

}
//Default Constructor :-->
class Default_Constructor_Student_info{
	
	int roll_nos;
	int marks1;
	int marks2;
	int total;
	
	
	 Default_Constructor_Student_info(){ // Default Constructor
		 
		 roll_nos = 8865;
		 marks1 = 50;
		 marks2 = 30;
		 
	 }
	 int Total() {
		 
		 total = marks1+marks2;
		 return total;
		 
	 }
	 
	 void Display_Result() {
		 
		 System.out.println("The Roll number of the student is "+roll_nos);
		 System.out.println("Marks 1 :"+marks1);
		 System.out.println("Marks 2 :"+marks2);
		 System.out.println("Total :"+total);
		 
	 }

	 
}



//Parameterised Constructor:-->

class Student_info{
	
	int rollnos;
	int Marks1;
	int Marks2;
	int Total;
	
	
	
	Student_info(int roll_nos , int m1 , int m2){
		
		rollnos = roll_nos;
		Marks1 = m1;
		Marks2 = m2;
		
	}
	
	int total() {
		
		Total = Marks1+Marks2;
		return Total;
		
		
	}
	
	void displayinfo() {
		
		
		System.out.println("Roll number is :"+rollnos);
		System.out.println("Marks 1 :"+Marks1);
		System.out.println("Marks 2 :"+Marks2);
		
	}
	
}


























