import java.util.Scanner;
public class PasswordValidation {
	public static void main(String[] args){
		String password = "dedamama";
		Scanner read = new Scanner(System.in);
		System.out.println("What is the password?");
		String entered = read.nextLine();
		if(entered.equals(password)){
			System.out.println("Welcome");
		}
		//TOO EASY!!!!!!!!!!!
		else{
			System.out.println("I do not know you!");
		}
	}
}
