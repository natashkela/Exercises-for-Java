/* Compare the numbers and show the largest one. If numbers are equal show one of them*/
import java.util.Scanner;
public class ComparingNumbers {
	public static void main(String[] args){
		System.out.println("Please enter how many numbers you want to compare");
		Scanner read = new Scanner(System.in);
		int cap = read.nextInt();
		int[] array = new int[cap];
		for(int i=0;i<cap;i++){
			System.out.printf("Please enter %d numebr",i+1);
			array[i]=read.nextInt();
		}
		for(int i=1;i<cap;i++){
			if(array[i-1]>array[i]){
				int temp = array[i-1];
				array[i-1]=array[i];
				array[i]=temp;
			}
		}
		System.out.printf("The largest element in the array is %d",array[cap-1]);
	}
}
