import java.util.Scanner;
public class AddingNumbers {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter how many numbers you want to add up");
		int max = read.nextInt();
		int[] array = new int[max];
		int result=0;
		for(int i=0;i<max;i++){
			array[i]=read.nextInt();
			result=result+array[i];
		}
		System.out.printf("The result is %d", result);
	}
}
