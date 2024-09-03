package javapackage2;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		int sum1,sum2;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the value of a:");
		int b=sc.nextInt();
		System.out.println("Enter the value of b:");
		int c=sc.nextInt();
		System.out.println("Enter the value of c:");
		int d=sc.nextInt();
		System.out.println("Enter the value of d:");
		sum1=a+b;
		System.out.println("sum of a and b is: "+sum1);			
		sum2=c+d;
		System.out.println("sum of c and d is: "+sum2);
		if (sum1>sum2)
		{
			System.out.println("The sum of a and b is greater than sum of c and d");
			
		}
		
		else
		{
			System.out.println("The sum of a and b is not greater than sum of c and d");
		}
		
	}

}
