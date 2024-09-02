package javapackage2;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		
		if (a%2==0) //Local Variable   2/2 =0  Even  1/2 = 0.5 Odd
		                                  
		{
			System.out.println("a is even");
		}
		else {
			System.out.println("a is odd");
		}

	}
}
