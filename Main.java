package main;
import java.util.Scanner;
import EmployeeDetails.Employee;
import credentialServices.CredentialServices;

public class Main {
	public static void main(String[] args) {
		
		Employee employee = new Employee("Harshit", "Choudhary");
		
		CredentialServices cs = new CredentialServices();
		String email;
		String pwd;
		
		System.out.println("Please enter the department from the following:");
		System.out.println("1.Technical\n2.Admin\n3.HR\n4.Legal");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1) {
			email = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "tech");
			pwd = cs.generatePassword();
			cs.showCredentials(employee,email,pwd);
		}
		else if(choice==2) {
			email = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "admin");
			pwd = cs.generatePassword();
			cs.showCredentials(employee,email,pwd);	
		}
		else if(choice==3) {
			email = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "hr");
			pwd = cs.generatePassword();
			cs.showCredentials(employee,email,pwd);	
		}
		else if(choice==4) {
			email = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "legal");
			pwd = cs.generatePassword();
			cs.showCredentials(employee,email,pwd);
		}
		else {
			System.out.println("Enter a valid choice");
		}
		
		sc.close();
	}

}
