import java.util.Scanner;

public class PizzaCalculator {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("How many people? ");
		String peopleNum = read.nextLine();
		boolean val1=false,val2=false,val3=false;
		try{
			int people = Integer.parseInt(peopleNum);
			if(people<0){
				System.out.println("People cannot be negative number");
			}
			else{
				val1=true;
			}
		}
		catch(NumberFormatException e){
			System.out.println("Please enter a valid number");
		}
		System.out.println("How many pizzas do you have? ");
		String pizzaNum = read.nextLine();
		try{
			int pizza = Integer.parseInt(pizzaNum);
			if(pizza<0){
				System.out.println("Pizza is never negative");
			}
			else{
				val2=true;
			}
		}
		catch(NumberFormatException e){
			System.out.println("Please enter a valid number");
		}
		System.out.println("How many slices per pizza? ");
		String sliceNum = read.nextLine();
		try{
			int slice = Integer.parseInt(sliceNum);
			if(slice<0){
				System.out.println("Pizza slice is never negative");
			}
			else{
				val3=true;
			}
		}
		catch(NumberFormatException e){
			System.out.println("Please enter a valid number");
		}
		if(val1&&val2&&val3){
			int pizza = Integer.parseInt(pizzaNum);
			int slice = Integer.parseInt(sliceNum);
			int people = Integer.parseInt(peopleNum);
			int totalSlices = pizza*slice;
			int person = totalSlices/people;
			if(totalSlices%people==0){
				System.out.printf("%d people with %d pizzas\n",people,pizza);
				System.out.printf("Each person gets %d pieces\n", person);
				System.out.println("There are 0 leftover pieces");
			}
			else{
				int leftover = totalSlices%people;
				System.out.printf("%d people with %d pizzas\n",people,pizza);
				System.out.printf("Each person gets %d pieces\n", person);
				System.out.printf("There are %d leftover pieces\n",leftover);
			}
		}
		else{
			System.out.println("You did not write the correct input so you do not get to eat pizza!");
		}
	}
}
