package javapackage2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int i,number,count=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number to check if it is Prime:");
		number = sc.nextInt();
		
		for(i=2;i<=number/2;i++) //2
		{
			if(number % i ==0) {
				count++;
				break;
			}
		}

		if(count ==0 && number !=1) {
			System.out.println(number + " Is a prime number");
			
	}
	
		else {
		System.out.println(number + "Not a Prime");	
		}
	}
}