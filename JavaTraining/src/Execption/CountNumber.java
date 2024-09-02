package Execption;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer:");
		int number =sc.nextInt();
		 
		number = Math.abs(number);
		
		int digitcount=0;
		
		if(number == 0) {
			digitcount =1;
		} else {
			while(number>0)
			{
				number/=10;
				digitcount++;
			}
		}
		
		System.out.println("The number of digit is : " + digitcount);

	}
}