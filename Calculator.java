import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double billAmount=0;
		int tip=0;
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		boolean value=false;
		while(!value){
			System.out.println("Please enter Bill amount: ");
			try{
				billAmount = reader.nextDouble();
				if(billAmount>=0){
					System.out.println("Please enter tip percent:");
					tip = reader.nextInt();
						if(tip>=0){
							value=true;
						}
				}
			}
			catch(Exception e){
				System.out.println("Error input number");
				break;
			}
			
		}
		double tipEnd,billTotal;
		if(value){
			tipEnd=billAmount*tip/100;
			billTotal = tipEnd +billAmount;
			System.out.printf("The tip you are going to leave is: %f\n",tipEnd);
			System.out.printf("The total bill is: %f\n",billTotal);
		}
	}

}
