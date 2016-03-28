import java.util.Scanner;
public class LegalDrivingAge {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		String age;
		while(true){
			System.out.println("What is your age? ");
			age= read.nextLine();
			boolean val1 = false;
			try{
				int ag = Integer.parseInt(age);
				if(ag<0){
					System.out.println("Please enter a valid age");
					val1=true;
				}
				if(val1){
					continue;
				}
				break;
				
			}
			
			catch(NumberFormatException e){
				System.out.println("Please enter a number");
				continue;
			}
		}
		int ag = Integer.parseInt(age);
		if(ag<16){
			System.out.println("You are not old enough to legally drive");
		}
		else{
			System.out.println("You are old enough to drive legally");
		}
	}
}
