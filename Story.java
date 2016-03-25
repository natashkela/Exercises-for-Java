import java.util.Scanner;

public class Story {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter a noun: ");
		String noun = read.nextLine();
		System.out.println("Please enter a verb: ");
		String verb = read.nextLine();
		System.out.println("Please enter an adjective: ");
		String adjective = read.nextLine();
		System.out.println("Please enter an adverb: ");
		String adverb = read.nextLine();
		String result = "Do you see your ".concat(adjective+" ").
				concat(noun+" ").concat(verb+" ").concat(" outside very ").
				concat(adverb);
		System.out.println(result);
		System.out.println("Its hilarious");
		
	}
}
