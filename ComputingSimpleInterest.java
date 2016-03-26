import java.util.Scanner;
public class ComputingSimpleInterest {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String amount,rate,time;
		while(true){
			try{
				System.out.println("Enter the principal: ");
				amount = read.nextLine();
				int amt = Integer.parseInt(amount);
				System.out.println("Enter the rate: ");
				rate = read.nextLine();
				double rt = Double.parseDouble(rate);
				System.out.println("Enter the time: ");
				time = read.nextLine();
				int year = Integer.parseInt(time);
				calculateSimpleInterest(amt,rt,year);
				break;
			}
			catch(NumberFormatException e){
				System.out.println("Please enter a valid number");
				continue;
			}
		}
	}
	public static double calculateSimpleInterest (int amount, double rt, int time){
		for (int i=0;i<time;i++){
			double interest = amount*(1+((rt)/100*(i+1)));
			System.out.printf("After %d year at %f the investment will be worth %f\n", i,rt,interest);
		}
		double simple= amount*(1+((rt)/100*time));
		return simple;
	}
}
