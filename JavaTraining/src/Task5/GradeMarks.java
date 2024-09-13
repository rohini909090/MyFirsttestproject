package Task5;

import java.util.Scanner;

public class GradeMarks {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Students marks: ");
		int mark=sc.nextInt();
		
		//Determine the grade based on the mark
		
		
		if(mark>=100) {
			System.out.println("Invalid Input");
		}else {
		
			char grade = 0;
			
		if(mark==100) {
			grade ='S';
		}else if(mark>=90) {
			grade='A';
		}else if(mark>=80) {
			grade='B';
		}else if(mark>=70) {
		    grade='C';
		}else if(mark>=60) {
			grade='D';
		}else if(mark>=50) {
			grade='E';
		}else if(mark<=50) {
			grade='F';
		} 

		System.out.println("The student's grade is: " + grade);
}
}
}