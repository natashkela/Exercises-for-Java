import java.util.Scanner;
public class TemperatureConverter {
	public static void main(String[] args){
		System.out.println("Press C to convert from Farenheit to Celsius\nPress F to convert from Celsius to Farenheit");
		while (true){
			Scanner read = new Scanner(System.in);
			String choice = read.nextLine();
			if(choice.toUpperCase().equals("C")){
				String farenheit=null;
				while(true){
					System.out.println("Please enter the temperature in Farenheit");
					farenheit = read.nextLine();
					try{
						int faren = Integer.parseInt(farenheit);
						break;
					}
					catch(NumberFormatException e){
						System.out.println("Please enter a valid number");
						continue;
					}
				}
				int faren = Integer.parseInt(farenheit);
				int temperature = (faren-32)*(5/9);
				System.out.printf("The temperature in Celsius is %d",temperature);
				break;
			}
			else if(choice.toUpperCase().equals("F")){
					String celsius=null;
					while(true){
						System.out.println("Please enter the temperature in Celsius");
						celsius = read.nextLine();
						try{
							int cel = Integer.parseInt(celsius);
							break;
						}
						catch(NumberFormatException e){
							System.out.println("Please enter a valid number");
							continue;
						}
					}
					int cel = Integer.parseInt(celsius);
					int temp = (cel*9)/5+32;
					System.out.printf("The temperature in Celsius is %d",temp);
				break;
			}
			else{
				System.out.println("Please choose either C or F");
				continue;
			}
		}
	}
}
