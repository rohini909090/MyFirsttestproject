package Task5;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int rows=sc.nextInt();
		sc.close();
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=i ; j<rows ;j++) {
				System.out.println(" ");
			}
		}
		
		for(int k=1;k <= (2 * i -1);k++){
			System.out.print("*");
		}
		System.out.println();
	}

}
