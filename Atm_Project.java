package My_first_project;
import java.util.*;
public class Atm_Project {

	public static void main(String[] args) {
		int pin=1006;
		int balance=50000;
		
		int AddAmount =0;
		int TakeAmount=0;
		
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin number:"); 
		int password= sc.nextInt(); 
		
		if(password==pin) {
			System.out.println("Enter your name");
			name = sc.next();
			System.out.println("Welcome "+name );
			
			
			while(true) {
				System.out.println("Press 1 to check your balance");
				System.out.println("Press 2 to add amount");
				System.out.println("press 3 to take amount");
				System.out.println("Press 4 to take resipt");
				System.out.println("Press 5 to exit");
				
				
				int option = sc.nextInt();
				switch(option) {
				case 1:
					System.out.println("Your current balance is "+balance);
				    break;
				    
				case 2:
					System.out.println("How much amount did you want to add to your amount "+AddAmount);
					AddAmount = sc.nextInt();
					System.out.println("Succussfully credited");
					balance=AddAmount+balance;
					break;
					
				case 3:
					System.out.println("How much amount did you want to take");
					TakeAmount = sc.nextInt();
					if(TakeAmount>balance) {
						System.out.println("Your balance is insufficient");
						System.out.println("Try less than your available balance");
					}
					else
					{
						
						System.out.println("Successfully taken");
						balance = balance+TakeAmount;
					}
					break;
					
				case 4:
					System.out.println("Welcome to all in one mini ATM");
					System.out.println("Available balance is "+balance);
					System.out.println("Amount deposited   "+AddAmount);
					System.out.println("Amount withdraw   "+TakeAmount);
					System.err.println("Thanks For Coming");
					break;
					
				
				}
				
				if(option==5) {
					System.out.println("Thank you");
				}
			}
			
		}
		else {
			
			System.out.println("Wrong pin number");
		}

	}

}
