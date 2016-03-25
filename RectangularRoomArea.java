import java.util.Scanner;

public class RectangularRoomArea {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Do you want your input to be meters or feet?\n"
				+ "If you want meters please type 1, if you want feet please "
				+ "type in 2");
		String mf=read.nextLine();
		if(mf.equals("2")){
		System.out.println("What is the length of the room in feet? ");
		String length = read.nextLine();
		try {
			int len = Integer.parseInt(length);
			if(len<0){
				System.out.println("Your input is negative");
			}
		}
		catch(NumberFormatException e){
			System.out.println("Please enter a valid number");
		}
		System.out.println("What is the width of the room in feet? ");
		String width = read.nextLine();
		try{
			int wid = Integer.parseInt(width);
			if(wid<0){
				System.out.println("You entered negative number");
			}
		}
		catch(NumberFormatException e){
			System.out.println("Please enter a valid number");
		}
		int len = Integer.parseInt(length);
		int wid = Integer.parseInt(width);
		System.out.printf("Your entered dimensions are %d x %d\n",len,wid);
		int area = len*wid;
		System.out.printf("The area of the room is %d square foot\n",area);
		double lenCon = Math.sqrt(Math.pow(len,2)*0.09290304);
		double widCon = Math.sqrt(Math.pow(wid,2)*0.09290304);
		double conversion = lenCon*widCon;
		System.out.printf("%f square meters\n", conversion);
		
		}
		else if(mf.equals("1")){
			System.out.println("What is the length of the room in feet? ");
			String lengthm = read.nextLine();
			try {
				int lenm = Integer.parseInt(lengthm);
				if(lenm<0){
					System.out.println("Your input is negative");
				}
			}
			catch(NumberFormatException e){
				System.out.println("Please enter a valid number");
			}
			System.out.println("What is the width of the room in feet? ");
			String widthm = read.nextLine();
			try{
				int widm = Integer.parseInt(widthm);
				if(widm<0){
					System.out.println("You entered negative number");
				}
			}
			catch(NumberFormatException e){
				System.out.println("Please enter a valid number");
			}
			int lenm = Integer.parseInt(lengthm);
			int widm = Integer.parseInt(widthm);
			System.out.printf("Your entered dimensions are %d x %d\n",lenm,widm);
			int area = lenm*widm;
			System.out.printf("The area of the room is %d square meters\n",area);
			
		}
	}
}
