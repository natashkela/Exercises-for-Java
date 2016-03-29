import java.util.Scanner;
public class BMICalculator {
	public static void main(String[] args){
		Scanner read = new Scanner (System.in);
		String weight=null,height=null;
		while(true){
			System.out.println("Please enter the weight in pounds");
			weight = read.nextLine();
			try{
				int we = Integer.parseInt(weight);
				break;
			}
			catch(NumberFormatException e){
				System.out.println("please enter a valid number");
				continue;
			}
		}
		while(true){
			System.out.println("Please enter the height in inches");
			height = read.nextLine();
			try{
				int he = Integer.parseInt(height);
				break;
			}
			catch(NumberFormatException e){
				System.out.println("please enter a valid number");
				continue;
			}
		}
		double he = Double.parseDouble(height);
		double we = Double.parseDouble(weight);
		double BMI = (we/(he*he))*703;
		System.out.println(BMI);
		if(BMI>18.5&&BMI<25){
			System.out.printf("Your BMI is %f. You are within the range of normal BMI\n",BMI);
		}
		else if(BMI<18.5){
			System.out.printf("Your BMI is %f. You are under the range of normal BMI and should consult a doctor\n",BMI);
		}
		else {
			System.out.printf("Your BMI is %f. You are overweight so do not eat that much you fat bitch! ahhahahhha\n",BMI);
		}
	}
}
