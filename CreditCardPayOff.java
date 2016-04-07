import java.util.Scanner;
public class CreditCardPayOff {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("What is your balance? ");
		double balance = read.nextInt();
		System.out.println("What is the APR on the card (as a percent)?");
		double apr = read.nextInt();
		System.out.println("What is the monthly payment that you can make? ");
		double monthly = read.nextInt();
		calculateMonthsUntilPaidOff(balance,apr,monthly);
	}
	public static double calculateMonthsUntilPaidOff(double balance, double apr,double monthly){
		double months = (-1/30)*((Math.log(1+((balance/monthly)*(1-(Math.pow((1+apr/365),30))))))/Math.log(1+apr/365));
		System.out.printf("It will take you %f months to pay off this card", months);
		return months;
	}
}