import java.util.Scanner;

public class StringPlus {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String quote = "",author ="";
		while(quote==""&&author==""){
			System.out.println("Please enter a quote");
			quote=read.nextLine();
			System.out.println("Please enter an author");
			author = read.nextLine();
		}
		String total = author.concat(" says, \"").concat(quote).concat("\"");
		System.out.println(total);
	}
}
