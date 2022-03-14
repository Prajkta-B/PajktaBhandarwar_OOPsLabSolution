package credentialServices;
import java.util.Random;
import EmployeeDetails.Employee;
public class CredentialServices {
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String emailid;
		emailid = firstName+lastName+"@"+department+".coders.com";
		return emailid;
	}
	
	public String generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String digits ="1234567890";
		String specialChars = "!@#&*_";
		
		String pwdblock = capitalLetters + smallLetters + digits + specialChars;
		
		Random pass = new Random();
		char[] pwd = new char[8];
		for(int i=0;i<=7;i++) {
			pwd[i] = pwdblock.charAt(pass.nextInt(pwdblock.length()));
		}
		String password = pwd.toString();
		return password;
	}
	
	public void showCredentials(Employee emp,String email,String generatedPassword) {
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows" );
		System.out.println("Email --> "+email);
		System.out.println("Password --> "+ generatedPassword); 
	}
}
