import java.util.Scanner;

public class StringLength {
	public static void main (String[] args){
		Scanner read = new Scanner(System.in);
		String name =""; 
		while(name==""){
			System.out.println("Please enter your name: ");
			name = read.nextLine();
		}
		int length = name.length();
		System.out.printf("The length of %s is %d",name,length);
	}
}
