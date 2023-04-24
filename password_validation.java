package My_first_project;
import java.util.Scanner;
public class password_validation {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter Your Password and then Hit Enter:");
	String s=sc.next();
	int upc =0;
	int lwc=0;
	int nums=0;
	int spl_char=0;
	if(s.length()<8) {
		System.out.println("Your password must have atleast 8 characters");
	}
	else if (s.length()>8) {
		
		for (int i=0;i<s.length();i++) {
			if(s.charAt(0) >= 'A' && s.charAt(0) <='Z') {
				upc++;
				}
			else {
				System.out.println("The First Letter Must Have UpperCase");
				break;
			}
			if(s.charAt(i) >= 'A' && s.charAt(i) <='Z') {
				upc++;
				}
			else if(s.charAt(i) >= 'a' && s.charAt(i) <='z'){
				lwc++;
			}
			else if(s.charAt(i) >= '0' && s.charAt(i) <='9'){
				nums++;
			}
			else {
				spl_char++;
			}
		}
		if(upc>=1 && lwc>=1 && nums>=1 && spl_char>=1) {
			System.out.println("....Good....");
			System.out.println("Storing password");
			System.out.println("Your password is valid");
			System.out.println("Password accepted");
		}
		
		else {
			System.out.println("....oops....");
			System.out.println("Your password is not valid");
			System.out.println("password cannot accepted");
			System.out.println("Your password contains minimum");
			System.out.println("....1-Uppercase....");
			System.out.println("....1-Lowercase....");
			System.out.println("....1-number....");
			System.out.println("....1-Special character....");
		}
	}
	}

}
