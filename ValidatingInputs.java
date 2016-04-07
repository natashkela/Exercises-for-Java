import java.util.Scanner;
public class ValidatingInputs {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String firstName = read.nextLine();
		System.out.println("Please enter your last name: ");
		String lastName = read.nextLine();
		System.out.println("Please enter employee ID: ");
		String ID = read.nextLine();
		System.out.println("Please enter your zip code:");
		String zip = read.nextLine();
		if(nameValidate(firstName)&&
		lastValidate(lastName)&&
		employeeValidate(ID)&&
		zipValidate(zip)){
			System.out.println("No Errors Found");
		}
		
	}
	public static boolean nameValidate(String first){
		if(first.length()>=2){
			if(first.matches("[a-zA-Z]+")){
				return true;
			}
			System.out.println("Name should not have other characters then letters");
			return false;
		}
		else{
			System.out.println("The name should be more at least 2 letters");
			return false;
		}
	}
	
	public static boolean lastValidate(String lastName){
		if(lastName.length()>=2){
			if(lastName.matches("[a-zA-Z]+")){
				return true;
			}
			System.out.println("Last Name should not have other characters then letters");
			return false;
		}
		else{
			System.out.println("The last name should be more at least 2 letters");
			return false;
		}
	}
	
	public static boolean employeeValidate(String ID){
		if(ID.length()==7){
			if(ID.substring(0,2).matches("[a-zA-Z]+")&&
			   ID.charAt(2)=='-'&&
			   ID.substring(3,7).matches("[0-9]+")){
				return true;
			}
			System.out.println("Wrong format");
			return false;
		}
		else{
			System.out.println("Wrong employee ID");
			return false;
		}
	}
	
	public static boolean zipValidate(String zip){
		boolean val1 = true;
		try{
			int zipcode = Integer.parseInt(zip);
		}
		catch(NumberFormatException e){
			System.out.println("Zip code is not a number");
			val1= false;
		}
		return val1;
	}
}
