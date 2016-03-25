import java.util.Scanner;
public class CurrencyConversion {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		boolean val1=true;
		String euro = null,exchange=null;
		while(val1){
			System.out.println("How many euros are you going to exchange? ");
			euro = read.nextLine();
			System.out.println("What is the exchange rate? ");
			exchange = read.nextLine();
			try {
				double euros = Double.parseDouble(euro);
				double rate = Double.parseDouble(exchange);
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Please enter a valid number");
				continue;
			}
		}
		double euros = Double.parseDouble(euro);
		double rate = Double.parseDouble(exchange);
		double total = Math.round(euros*rate*100d)/100d;
		System.out.printf("%f euros at an exchange rate of %f is %f U.S Dollars", euros,rate,total);
		
	}
}
