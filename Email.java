package emailApp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private int defaultPWDlen = 10;
	private String department;
	private String email;
	String GU = "@unigoa.ac.in";
	private String altEmail;
	int pwd;
	
	Scanner scan = new Scanner(System.in);
	
	//constructor to receive first & last name
	public Email(String fname, String lname, int pwd) {
		
		this.firstname = fname;
		this.lastname = lname;
		this.pwd = pwd;
		
		//call method that asks for department and return it
		this.department = setDep();
		
		if (pwd == 1) {
			System.out.print("enter new password: ");
			this.password = scan.next();
		}else
		//call method to return a random password
			this.password = randomPassword(defaultPWDlen);
	
		//get email in format
		email = firstname.toLowerCase() + lastname.toLowerCase()  + "." + department.toLowerCase() + GU;	
	}
	
	//ask for department
	private String setDep() {
		System.out.print("Enter department for: " + this.firstname + " " + this.lastname + "\n1 for Botany\t2 for Computer Science\n3 for Zoology\t4 for Physics: ");
		int dep = scan.nextInt();
		if(dep == 1) { return "Botany"; }
		else if(dep == 2) { return "MCA"; }
		else if(dep == 3) { return "Zoology"; }
		else if(dep == 4) { return "Physics"; }
		else {return "not assigned"; }
	}
	
	//generate a random password
	private String randomPassword(int length) {
		String randomPWD = "QWERTYUIOPLKJHGFDSAZXCVBNMqwertyuioplkjhgfdsazxcvbnm1234567890!@#$%&*+";
		char[] password = new char[length];
		for (int i=0; i<length ;i++) {
			int randompwd = (int)(Math.random() * randomPWD.length());
			password[i] = randomPWD.charAt(randompwd);
		}
		return new String(password);
	}
	
	//set alternate email
	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	public String getAltEmail() {return altEmail; }
	
	public String getPassword() { return password; }
	
	public String display() {
		return "\nStudent name: " + firstname + " " + lastname + "\tDepartment: " + department +
				"\nEmail assigned: " + email + "\tinitial password: " + password ;  
	}
}	
	
	
