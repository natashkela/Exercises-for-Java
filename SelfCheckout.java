import java.util.Scanner;

public class SelfCheckout {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter the price of an item");
		String[] price = new String[3];
		String[] quantity = new String[3];
		double subtotal=0;
		boolean val1=true;
		while(val1){
			for(int i=0;i<price.length;i++){
					System.out.printf("Please enter the price of %d item: \n",i+1);
					price[i]=read.nextLine();
					System.out.printf("Please enter the quantity of %d item: \n",i+1);
					quantity[i]=read.nextLine();
					try{
						double itemPrice = Double.parseDouble(price[i]);
						int qty = Integer.parseInt(quantity[i]);
						
					}
					catch(NumberFormatException e){
						System.out.println("Please enter a valid number");
						break;
					}
					if(i==2){
						val1=false;
					}
				}
		}
		for(int i=0;i<price.length;i++){
			double priceItem = Double.parseDouble(price[i]);
			int qty = Integer.parseInt(quantity[i]);
			subtotal=subtotal+priceItem*qty;
		}
		System.out.printf("Subtotal: %f\n", subtotal);
		double tax = subtotal*0.055;
		System.out.printf("Tax: %f\n",tax);
		double total = subtotal+tax;
		System.out.printf("Total: %f\n", total);
		
	}
}
