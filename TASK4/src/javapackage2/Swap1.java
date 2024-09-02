package javapackage2;

import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
	
		
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		
		{
			System.out.println("Enter the First number:");
			a=sc.nextInt();
			
		}
 
		{
			System.out.println("Enter the second number:");
			b=sc.nextInt();
		}
		{
			System.out.println("\nbefore swap:a='+a+' and b="+b);
		
		temp=a;
		a=b;
		b=temp;
			System.out.println("\nafter swap:a='+a+' and b="+b);
		}

	}

}