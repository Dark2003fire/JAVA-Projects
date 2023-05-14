
class Employee{
	
	int Emp_id;
	String Emp_name;
	float Emp_Salary;
	
	public void setdata(int Emp_id,  String Emp_name , float Emp_Salary) {
		
		this.Emp_id  = Emp_id;
		this.Emp_name = Emp_name;
		this.Emp_Salary = Emp_Salary;
		
		
		
	}
	
	public void Display() {
		
		System.out.println("The Employee id is :"+this.Emp_id);
		System.out.println("The name of the Employee is "+this.Emp_name);
		System.out.println("The Salary of the Employee is "+this.Emp_Salary);
		
		
		
		
	}
	
	
}
public class Array_of_Objects {

	public static void main(String[] args) {
		
		Employee Emp = new Employee();
		Employee[] Ep = new Employee[2];
		Ep[0].setdata(1, "Hitesh", 250000.00f);
		Ep[1].setdata(2, "Faizan", 250000.00f);
		Ep[0].Display();
		Ep[1].Display();
		
		
		

	}

}



