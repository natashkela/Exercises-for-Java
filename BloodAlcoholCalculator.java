import java.util.Scanner;
public class BloodAlcoholCalculator {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String weight,gender,numOfDrinks,amtDrinksConsumed, lastDrink;
		System.out.println("Please enter your weight: ");
		weight = read.nextLine();
		int we = Integer.parseInt(weight);
		System.out.println("Please enter your gender: ");
		gender = read.nextLine();
		System.out.println("Please enter your number of drinks: ");
		numOfDrinks = read.nextLine();
		int numdrink = Integer.parseInt(numOfDrinks);
		System.out.println("Please enter your amount of Drinks Consumed: ");
		amtDrinksConsumed = read.nextLine();
		int amtdrink = Integer.parseInt(amtDrinksConsumed);
		System.out.println("Please enter amount of time since you last drank: ");
		lastDrink = read.nextLine();
		int time = Integer.parseInt(lastDrink);
		double r = 0;
		if(gender.equals("female")){
			r = 0.73;
		}
		else if(gender.equals("male")){
			r=0.66;
		}
		double bac = amtdrink*5.14/we*r-(0.015*time);
		if(bac>0.08){
			System.out.println("Go home, you are drunk! ");
		}
		else {
			System.out.println("You can go ahead and drive");
		}
		}
	}

