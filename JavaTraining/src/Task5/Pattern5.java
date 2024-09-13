package Task5;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of rows with '**': ");
		int doubleStarRows=sc.nextInt();
		
		System.out.println("Enter the no of rows with '*': ");
		int singleStarRows=sc.nextInt();
		
		for(int i=0;i< doubleStarRows;i++) {
			System.out.println("**");
		}
				
        for(int i=0;i<singleStarRows;i++) {				
		System.out.println("*");
        }
		
        for(int i=0;i< doubleStarRows;i++) {
			System.out.println("**");
	}

}
}