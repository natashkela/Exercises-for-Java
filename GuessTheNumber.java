import java.util.*;
public class GuessTheNumber {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner read = new Scanner(System.in);
		System.out.println("Please select the difficulty level and enter 1,2,3 respectively");
		int num=read.nextInt();
		if(num==1){
			int n = rand.nextInt(10)+1;
			int exp=0;
			System.out.println("Guess it!");
			while(n!=exp){
				exp=read.nextInt();
				if(exp==n){
					System.out.println("You guessed it!");
				}
				else if(exp<n){
					System.out.println("your number is lower");
				}
				else{
					System.out.println("your number is higher");
				}
			}
		}
		else if(num==2){
			int n = rand.nextInt(100)+1;
			int exp=0;
			System.out.println("Guess it!");
			while(n!=exp){
				exp=read.nextInt();
				if(exp==n){
					System.out.println("You guessed it!");
				}
				else if(exp<n){
					System.out.println("your number is lower");
				}
				else{
					System.out.println("your number is higher");
				}
			}
		}
		else if(num==3){
			int n = rand.nextInt(1000)+1;
			int exp=0;
			System.out.println("Guess it!");
			while(n!=exp){
				exp=read.nextInt();
				if(exp==n){
					System.out.println("You guessed it!");
				}
				else if(exp<n){
					System.out.println("your number is lower");
				}
				else if(exp>n){
					System.out.println("your number is higher");
				}
			}
		}
		else{
			System.out.println("Please enter a number between 1,3");
		}
	}
}
