import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		System.out.println("enter a string");
		String s= input.nextLine();
		
		//Display Result
		System.out.println("Ignoring non alphanumeric characters , \n"
				+ "is "+ s + " a palindrome ?"+ isPalindrome(s));
		

	}

	public static Boolean isPalindrome(String s) {
		String s1= filter(s);
		String s2= reverse(s1);
		
		return s2.equals(s1) ;
	}

	

	public static String filter(String s) {
		StringBuilder sb= new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			if(Character.isLetterOrDigit(s.charAt(i)))
				sb.append(s.charAt(i));
			
			
		}
		return sb.toString();
	}
	
	private static String reverse(String s) {
		StringBuilder sb= new StringBuilder(s);
		
		sb.reverse();
		
		
		return sb.toString();
	}
	
	

}
