package emailApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String fname = null, lname = null;
		int flag=1, pwd=0;
		boolean run = true; 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Hello admin! let's get some work done!\n");
		
		while (run==true) {
			System.out.print("\n\nhave to register students? press 1 & Enter 0 once done! ");
			flag = scan.nextInt();
		switch (flag){
			case 0:
				System.out.println("\nThat's a lot of work done admin! relax and enjoy your break!\n");
				run = false;
				break;
			case 1:
				System.out.print("Enter student's first name: ");
				fname = scan.next();
				System.out.print("Enter student's last name: ");
				lname = scan.next();
				System.out.print("would you like to assign password manually? 1=yes else enter any whole number != 1 ");
				pwd = scan.nextInt();
				Email email = new Email(fname, lname, pwd);
				System.out.println(email.display());
				break;
			default:
				System.out.print("invalid input!!");	
				}
			}
	}

}
