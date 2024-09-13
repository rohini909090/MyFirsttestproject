package Task5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str= sc.nextLine();
		sc.close();
		
		str=str.toLowerCase();
		
		
		boolean  isPalindrome=true;
		
		
		for(int i=0;i<=str.length()/2;i++)
		{
			if(str.charAt(i) != str.charAt(str.length() -i -1)) {
				isPalindrome = false; 
				break;
				
			}
				
		}
		
		if(isPalindrome)
		{
			System.out.println("\"" +str + "\" is a palindrome.");
		}else {
			System.out.println("\"" +str + "\" is not a palindrome.");
		}

	}

}
