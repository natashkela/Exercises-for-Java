import java.util.Scanner;
public class PaintCalculator {
	public static void main(String[] args){
		final int galloon=350;
		Scanner read = new Scanner(System.in);
		System.out.println("If the room is rectangular, please press 1.\n"+
		"If the room is circular please press 2\n");
		String roomKind = read.nextLine();
		boolean val1=false;
		try{
			int kind = Integer.parseInt(roomKind);
			if(kind<0||kind>2){
				System.out.println("You did not choose either 1,2");
			}
			else{
				val1=true;
			}
		}
		catch(NumberFormatException e){
			System.out.println("Please enter a valid number");
		}
		if(val1){
			if(roomKind.equals("1")){
				boolean value1=false;
				System.out.println("What is the length of the room? ");
				String length = read.nextLine();
				try {
					int rlength = Integer.parseInt(length);
					if(rlength<0){
						System.out.println("Please do not enter negative number");
					}
					else{
						value1=true;
					}
				}
				catch(NumberFormatException e){
					System.out.println("Please enter valid number");
				}
				
				boolean value2=false;
				System.out.println("What is the width of the room? ");
				String width = read.nextLine();
				try {
					int rwidth = Integer.parseInt(width);
					if(rwidth<0){
						System.out.println("Please do not enter negative number");
					}
					else{
						value2=true;
					}
				}
				catch(NumberFormatException e){
					System.out.println("Please enter valid number");
				}
				
				if(value1&&value2){
					int len = Integer.parseInt(length);
					int wid = Integer.parseInt(width);
					int area = len*wid;
					int paint = area%galloon;
					int paintNeeded;
					if(paint>0){
						paintNeeded=area/galloon+1;
					}
					else{
						paintNeeded=area/galloon;
					}
					System.out.printf("Paint you need to cover %d square feet is %d galloon",area,paintNeeded);
				}
			}
			
			else if(roomKind.equals("2")){
				System.out.println("What is the radius of the room? ");
				String radius = read.nextLine();
				boolean value3=false;
				try{
					int roomRadius = Integer.parseInt(radius);
					if(roomRadius<0){
						System.out.println("You entered negative number");
					}
					else{
						value3=true;
					}
				}
				catch(NumberFormatException e){
					System.out.println("You did not enter a valid number");
				}
				if(value3){
					int rad = Integer.parseInt(radius);
					double circleArea = Math.PI*Math.pow(rad, 2);
					double circle = circleArea%galloon;
					int paintCircle;
					if(circle>0){
						paintCircle = (int) Math.round(circleArea/galloon)+1;
						System.out.printf("You will need to have %d galloon to paint your circular room\n",paintCircle);
					}
					else{
						paintCircle = (int) Math.round(circleArea/galloon);
						System.out.printf("You will need to have %d galloon to paint your circular room\n",paintCircle);
					}
				}
			}
			else {
				System.out.println("Please enter either 1,2");
			}
			
		}
	}
}
