import java.util.*;
public class BankingApplication {

	public static void main(String[] args) {
		
		BankAccount obj = new BankAccount("Arshi" , "886589Ar");
		obj.ShowMenu();
		
		

	}

}
class BankAccount
{
	int balance;
	int previousTransactions;
	String customerName;
	String customerId;
	
	BankAccount(String cname , String cid){
		
		customerName = cname;
		customerId = cid;
		
	}
	
	void deposit(int amount) {
		
		if(amount!=0) {
			
			balance = balance+amount;
			previousTransactions = amount;
			
			
		}
	}
void withdraw(int amount) {
		
		if(amount!=0) {
			
			balance = balance-amount;
			previousTransactions = -amount;
			
			
		}
	}
	
	void getPreviousTransaction() {
		
		
		if(previousTransactions>0) {
			System.out.println("Deposited:"+previousTransactions);
			
		}
		else if (previousTransactions<0) {
			
			System.out.println("Withdrawn"+Math.abs(previousTransactions));
			
		}
		else {
			    System.out.println("NO Transactions Occured");
			    
			    
			
		
		}
		
	}
	
	void ShowMenu() {
		
		
		char option = '\0';
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to my Banking Application");
		System.out.println("Your Id is :"+customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous Transaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("============================================================");
			System.out.println("Enter an Option");
			System.out.println("=============================================================");
			option = sc.next().charAt(0);
			System.out.println("\n");
			
			
			
			switch(option) {
			
			case 'A':
				System.out.println("----------------------------------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("-----------------------------------------------------------");
				option = sc.next().charAt(0);			
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("----------------------------------------------------------");
				System.out.println("Enter an Amount to deposit: ");
				System.out.println("-----------------------------------------------------------");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("----------------------------------------------------------");
				System.out.println("Enter the Amount to be withdrawn:");
				System.out.println("-----------------------------------------------------------");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
				
			case 'D':
				System.out.println("----------------------------------------------------------");
				getPreviousTransaction();
				System.out.println("-----------------------------------------------------------");
				System.out.println("\n");
				break;
				
				
			case 'E':
				System.out.println("************************************************************");
				break;
				
				default :
					System.out.println("Invalid Otion!!!!!!!!! Please Enter Again");
					
			
			
			}
			
			
		}while(option!='E');
		
			System.out.println("Thank You for using my application");
		
			
		
		
		
		
	}
	
	
	
	
	

}


















