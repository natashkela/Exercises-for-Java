import java.util.Scanner;
public class PasswordStrengthIndicator {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter the password you are trying to test");
		String password = read.nextLine();
		String regex = "a-z~@#$%^&*:;<>.,/}{+";
		if (password.matches("[0-9]+") && password.length() <= 8){
			System.out.println("Your password is very weak");
		}
		
		if(password.matches("[a-zA-Z]+")&&password.length()<=8){
			System.out.println("Your password is weak");
		}
		
		if(password.matches("[a-zA-Z0-9]+")&&password.length()>=8){
			System.out.println("Your password is strong");
		}
		else if(password.matches("["+regex+"a-zA-Z0-9]+")&&password.length()>=8){
			System.out.println("Your password is very strong");
		}
		
	}
}
