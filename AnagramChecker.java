import java.util.Scanner;
public class AnagramChecker {
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.println("Please enter the first word");
		String first = read.nextLine();
		System.out.println("Please enter the second word");
		String second = read.nextLine();
		isAnagram(first,second);
	}
	public static boolean isAnagram(String first,String second){
		int z=0;
		if(first.length()==second.length()){
			for(int i=0;i<first.length();i++){
				if(first.contains(second.substring(i,i+1))){
					z++;
				}
			}
		}
		else{
			System.out.println("Sorry these words are not anagrams");
			return false;
		}
		if(z==first.length()){
			System.out.println("These words are anagrams");
			return true;
		}
		return false;
	}
}
