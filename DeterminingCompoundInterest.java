import java.util.Scanner;
public class DeterminingCompoundInterest {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		while(true){
			try{
				System.out.println("What is the principal amount? ");
				String amount = read.nextLine();
				int amt = Integer.parseInt(amount);
				System.out.println("What is the rate? ");
				String rate = read.nextLine();
				double rt = Double.parseDouble(rate);
				System.out.println("What is the number of years? ");
				String years = read.nextLine();
				int time = Integer.parseInt(years);
				System.out.println("What is the number of times the interest is compounded per year?");
				String perYear = read.nextLine();
				int per = Integer.parseInt(perYear);
				double compound = amt*Math.pow((1+(rt/100/per)),per*time);
				System.out.printf("%d invested at %f for %d years compounded %d times per year is %f",amt,rt,time,per,compound);
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Please enter a valid number");
				continue;
			}
		}
	}
}
