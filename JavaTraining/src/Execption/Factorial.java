package Execption;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter any number :");
		int number=sc.nextInt();
		long fact =1;
		
		for(int i=1;i<=number;i++)
			
		{
		fact *=i;//n*
		
	}
System.out.format("The Factorial of " + number + "is:" + fact);
}
}