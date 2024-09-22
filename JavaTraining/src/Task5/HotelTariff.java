package Task5;

import java.util.Scanner;

public class HotelTariff {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter the room rent per day:");
		double roomrent=sc.nextDouble();

		
		System.out.println("Enter the month number(1-12): ");
		int month=sc.nextInt();
		
		
		System.out.println("Enter the no of days to be stayed:");
		int noofdays=sc.nextInt();
		
		double finaltariffperday=roomrent;
		
		
		switch(month) {
		
		case 4 : // April
		case 5 : //May
		case 6 : //June
		case 11 : //November
		case 12 : //December
			
			finaltariffperday= roomrent * 1.20;
			break;
			default:
				finaltariffperday = roomrent;
				break;
		}
		
		double totaltariff =finaltariffperday * noofdays;
		
		System.out.printf("The total room rent for %d days is : %2f\n",noofdays,totaltariff);
	}

}
