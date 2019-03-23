package softwareEffortEstimation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdjustedManHours extends ManHours {
	
	private Scanner scan;
	private double rcp;
	static double adjustedManHours;
	
	public AdjustedManHours() {
		
	}
	
	public AdjustedManHours(int totalAT, int unadjustedUCP, double szUC, double ucp, double manHour, double adjustedManHours) {
		super(totalAT, unadjustedUCP, szUC, ucp, manHour);
		AdjustedManHours.adjustedManHours = adjustedManHours;
	}
	
	public double getAdjustedManHours() {
		adjustedManHours = (1.0 + rcp) * manHour;
		return adjustedManHours;
	}
	
	public void adjustingManHours() {
		
		scan = new Scanner(System.in);
		boolean repeat = true;
		
		System.out.print("Please key in the risk coefficient percentage : ");
		while (repeat) {
		    try {
		    	rcp = scan.nextDouble();
		    	break;
		    } catch (InputMismatchException e) {
		    	System.out.println("Invalid input! Please key in number.");
		    	System.out.print("Please key in the risk coefficient percentage : ");
		    	scan.next();
		    	repeat = true;
		    }
		}

		System.out.println("--------------------------------------------------------");
		System.out.printf("Adjusted Man-Hours are %.2f" , getAdjustedManHours());
		System.out.println("\n--------------------------------------------------------");
	}
}
