package softwareEffortEstimation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManHours extends EFactor {

	private Scanner scan;
	private int effortRate;
	static double manHour;
	
	public ManHours() {
		
	}
	
	public ManHours(int totalAT, int unadjustedUCP, double szUC, double ucp, double manHour) {
		super(totalAT, unadjustedUCP, szUC, ucp);
		ManHours.manHour = manHour;
	}
	
	public double getManHour() {
		manHour = effortRate * ucp;
		return manHour;
	}
	
	public void calculatingManHours() {
		
		scan = new Scanner(System.in);
		boolean repeat = true;
		double rating = 0.0;
		
		System.out.print("Please key in the effort rate (20 or 28) : ");
		while (repeat) {
		    try {
		    	effortRate = scan.nextInt();
		    	do {
		    		if (effortRate == 20 || effortRate == 28) {
		    			rating = getManHour();
		    		} else {
		    			System.out.print("Invalid! Please key in effort rate (20 or 28) : ");
		    			effortRate = scan.nextInt();
		    			rating = getManHour();
		    		}
		    	} while (effortRate != 20 && effortRate != 28);
		    	break;
		    } catch (InputMismatchException e) {
		    	System.out.println("Invalid input! Please key in an integer number.");
		    	System.out.print("Please key in effort rate (20 or 28) : ");
		    	scan.next();
		    	repeat = true;
		    }
		}
		System.out.println("--------------------------------------------------------");
		System.out.printf("Man-Hours are %.2f" , rating);
		System.out.println("\n--------------------------------------------------------");
	}
}
