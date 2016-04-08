import java.util.*;
public class EmployeeListRemoval {
	public static void main(String[] args){
		LinkedList <String> employees = new LinkedList<String>();
		Scanner read = new Scanner(System.in);
		System.out.println("How many employees do you want to have? ");
		int max = read.nextInt();
		System.out.println("Please enter their names");
		String employee;
		for(int i=0;i<=max;i++){
			employee=read.nextLine();
			employees.add(employee);
		}
		System.out.println("Your employees are: ");
		for(int i=1;i<=max;i++){
			System.out.println(employees.get(i));
		}
		System.out.println("Enter a name of employee to remove: ");
		String delete = read.nextLine();
		for(int i=1;i<employees.size();i++){
			if(employees.get(i).equals(delete)){
				employees.remove(delete);
			}
		}
		System.out.printf("Now you have %d employees left instead of %d",max-1,max);
	}
}
