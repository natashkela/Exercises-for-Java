import java.util.Calendar;
import java.util.Scanner;

public class RetirmentCalculator {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter your current age: ");
		String currentAge = read.nextLine();
		int current=0,retirment=0;
		try{
			current = Integer.parseInt(currentAge);
			if(current<0){
				System.out.println("Your age cannot be negative");
			}
		}
		catch(NumberFormatException e){
			System.out.println("Please enter a valid number");
		}
		System.out.println("At what age do you want to retire");
		String retirmentAge = read.nextLine();
		try{
			retirment = Integer.parseInt(retirmentAge);
			if(retirment<0){
				System.out.println("Your age cannot be negative");
			}
		}
		catch(NumberFormatException e){
			System.out.println("Please enter a valid number");
		}
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int yearsLeft=retirment-current;
		int retirmentyear=year+yearsLeft;
		if(yearsLeft>0){
		System.out.printf("You have %d years until you retire\n",yearsLeft);
		System.out.printf("It is %d year now so you can retire on %d", year,retirmentyear);
		}
		else{
			System.out.printf("You had %d years to retire\n",(-1)*yearsLeft);
			System.out.printf("It is %d year now so you could have retired on %d", year,retirmentyear);
		}
	}
}
