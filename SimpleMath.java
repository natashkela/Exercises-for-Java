import java.util.Scanner;

public class SimpleMath {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		String num1=read.nextLine();
		System.out.println("Please enter second number: ");
		String num2=read.nextLine();
		double number1 = Double.parseDouble(num1);
		double number2 = Double.parseDouble(num2);
		double add = number1+number2;
		double substract = number1 -number2;
		double divide = number1/number2;
		double multiply = number1*number2;
		System.out.printf(num1.concat("+").concat(num2+"=%f\n"),add);
		System.out.printf(num1.concat("-").concat(num2+"=%f\n"),substract);
		System.out.printf(num1.concat("/").concat(num2+"=%f\n"),divide);
		System.out.printf(num1.concat("*").concat(num2+"=%f\n"),multiply);
	}
}
