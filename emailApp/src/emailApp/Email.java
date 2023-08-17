package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String department;
	private int defaultpasswordlength = 10;
	int mailBoxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";

	// constructor to recieve the first and last name;
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED :" + this.firstName + " " + this.lastName);

		// call a method asking for the department return the department
		this.department = setDepartment();
		System.out.println("Department:" + this.department);
		// call a method that returns random password
		this.password = setPassword(defaultpasswordlength);
		System.out.println("Your password:" + this.password);
		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println(email);

	}

	// ask for the department;
	private String setDepartment() {
		System.out.print(
				"DEPARTMENT CODES \n Enter the department\n1 for sales\n2 for Development\n3 for Accounting\n0 for none \n Enter the department codes");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if (depChoice == 1) {
			return "sales";
		} else if (depChoice == 2) {
			return "dev";
		} else if (depChoice == 3) {
			return "acct";
		} else {
			return "";
		}

	}

	// generate a random password;
	private String setPassword(int length) {
		String p = "ABCDYUROEHFBJFSDKFCJLKJ@435657&*";
		char[] pw = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * p.length());
			pw[i] = p.charAt(rand);
		}
		return new String(pw);
	}

	// set the mailBoxCapacity;
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;

	}

	// set the alternate email;
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;

	}

	// change the password;
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "DISPLAY NAME : " + firstName + " " + lastName + " COMPANY EMAIL " + email + " MAILBOX CAPACITY : "
				+ mailBoxCapacity + " mb ";

	}

}
