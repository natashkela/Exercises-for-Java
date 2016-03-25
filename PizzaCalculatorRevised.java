import java.util.Scanner;
public class PizzaCalculatorRevised {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("How many people? ");
		String peopleNum = read.nextLine();
		boolean val1=false;
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
		
		System.out.println("How many slices per person? ");
		String sliceNum = read.nextLine();
		boolean val2=false;
		try{
			int slice = Integer.parseInt(sliceNum);
			if(slice<0){
				System.out.println("People cannot be negative number");
			}
			else{
				val2=true;
			}
		}
		catch(NumberFormatException e){
			System.out.println("Please enter a valid number");
		}
		int perpizza = 4;
		int people = Integer.parseInt(peopleNum);
		int slice = Integer.parseInt(sliceNum);
		int needPizza = people*slice;
		if(needPizza/4==0){
			System.out.printf("You need to order %d pizzas\n",needPizza/4);
		}
		else{
			int morePizza=needPizza/4+(needPizza%4+(4-needPizza%4))/4;
			System.out.printf("You need to order %d pizzas\n",morePizza);
		}
	}
}
