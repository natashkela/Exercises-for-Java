import java.util.Scanner;

public class SimpleMathAdvanced {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		String num1=read.nextLine();
		int number1=0,number2 = 0;
		try{
			  number1 = Integer.parseInt(num1);
			 if(number1<0){
					System.out.println("Please do not enter negative numbers");
				}
		}
		catch(NumberFormatException e){
			System.out.println("Not a valid number");
		}
		System.out.println("Please enter second number: ");
		String num2=read.nextLine();
		try{
			  number2 = Integer.parseInt(num2);
			 if(number2<0){
					System.out.println("Please do not enter negative numbers");
				}
		}
		catch(NumberFormatException e){
			System.out.println("Not a valid number");
		}
		
		System.out.printf(num1.concat("+").concat(num2+"=%d\n"),add(number1,number2));
		System.out.printf(num1.concat("-").concat(num2+"=%d\n"),substract(number1,number2));
		System.out.printf(num1.concat("/").concat(num2+"=%d\n"),divide(number1,number2));
		System.out.printf(num1.concat("*").concat(num2+"=%d\n"),multiply(number1,number2));
		
	}
	
	public static int add(int number1,int number2){
		int add = number1+number2;
		return add;
	}
	public static int substract(int number1,int number2){
		int substract = number1-number2;
		return substract;
	}
	public static int divide(int number1,int number2){
		int divide = number1/number2;
		return divide;
	}
	public static int multiply(int number1,int number2){
		int multiply = number1*number2;
		return multiply;
	}
}
