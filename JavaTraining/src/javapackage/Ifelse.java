package javapackage;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a,b,c,d;
		
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		
		System.out.println("Entert eh value of b: ");
		b=sc.nextInt();
		
		System.out.println("Entert the value of c: ");
		c=sc.nextInt();
		
		System.out.println("Enter the value of d: ");
		d=sc.nextInt();
				
		if(a + b > c + d)
		{
			System.out.println("the sum of a and b is greater than sum of c and d");
		}
		
		else {
			System.out.println("the sum of a and b is not greater than sum of c and d");
		}
	}

}
