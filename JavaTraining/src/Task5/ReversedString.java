package Task5;

import java.util.Scanner;

public class ReversedString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:" );
		String str=sc.nextLine();
		sc.close();
		
		String reversedStr="";
		
		
		for(int i=str.length()-1 ;i>=0;i--) {
			reversedStr += str.charAt(i);
			
		}
		
System.out.println("Reversed string: " +reversedStr);
	}

}
