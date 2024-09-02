package Execption;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age= sc.nextInt();
		
		if(age >= 60) {
			System.out.println("You are eligible.");
		}
		
		else {
			System.out.println("Not Eligible");
		}
	}

}
