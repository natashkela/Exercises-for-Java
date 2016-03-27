import java.util.Scanner;
public class TaxCalculator {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String amount, state;
		while(true){
			System.out.println("What is the order amount? ");
			amount = read.nextLine();
			try{
				int amt = Integer.parseInt(amount);
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Please enter a valid number");
				continue;
			}
		}
		System.out.println("What is the state? ");
		state = read.nextLine();
		state = state.toUpperCase();
		int amt = Integer.parseInt(amount);
		double tax;
		double total;
		if(state.equals("WI")||state.equals("WISCONSIN")){
			tax = amt*0.055;
			total = amt+tax;
			System.out.printf("The subtotal is %d\nThe tax is %f\nThe total is %f\n", amt,tax,total);
		}
		else{
			System.out.printf("The total is %d", amt);
		}
	}
}
