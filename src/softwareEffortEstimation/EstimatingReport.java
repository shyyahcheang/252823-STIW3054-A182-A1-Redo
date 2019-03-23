package softwareEffortEstimation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstimatingReport extends AdjustedManHours implements EstimatingReportType {

	private Scanner scan;
	private int simpleRT, averageRT, complexRT, totalRT;
	private double totalManHours;
	
	public EstimatingReport() {
		
	}
	
	public EstimatingReport(int totalAT, int unadjustedUCP, double szUC, double ucp, double manHours, double adjustedManHours, double totalManHours) {
		super(totalAT, unadjustedUCP, szUC, ucp, manHours, adjustedManHours);
		this.totalManHours = totalManHours;
	}
	
	public double getTotalManHours() {
		totalManHours = totalRT + adjustedManHours;
		return totalManHours;
	}

	public void weightingReports() {
		
		scan = new Scanner(System.in);
		boolean repeat = true;
		int qty = 0, averageMH = 0;
		
		System.out.print("Quantity of Simple Report Type : ");
		while (repeat) {
		    try {
				qty = scan.nextInt();
				break;
		    } catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("Quantity of Simple Report Type : ");
				scan.next();
				repeat = true;
		    }
        }
		System.out.print("Average Man-hours of Simple Report Type : ");
		while (repeat) {
		    try {
				averageMH = scan.nextInt();
				break;
		    } catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("Average Man-hours of Simple Report Type : ");
				scan.next();
				repeat = true;
		    }
		}
		ContextER er = new ContextER(new CalSimpleReportMhEstimate());
		simpleRT = er.executeEstimatingReport(qty, averageMH);
		System.out.println("Sub total for Simple Report Type is " + simpleRT);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("Quantity of Average Report Type : ");
		while (repeat) {
		    try {
				qty = scan.nextInt();
				break;
		    } catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("Quantity of Average Report Type : ");
				scan.next();
				repeat = true;
		    }
		}
		System.out.print("Average Man-hours of Average Report Type : ");
		while (repeat) {
		    try {
			averageMH = scan.nextInt();
			break;
		    } catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("Average Man-hours of Average Report Type : ");
				scan.next();
				repeat = true;
		    }
		}
		er = new ContextER(new CalSimpleReportMhEstimate());
		averageRT = er.executeEstimatingReport(qty, averageMH);
		System.out.println("Sub total for Average Report Type is " + averageRT);
		System.out.println("--------------------------------------------------------");

		System.out.print("Quantity of Complex Report Type : ");
		while (repeat) {
		    try {
				qty = scan.nextInt();
				break;
		    } catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("Quantity of Complex Report Type : ");
				scan.next();
				repeat = true;
		    }
		}
		System.out.print("Average Man-hours of Complex Report Type : ");
		while (repeat) {
		    try {
				averageMH = scan.nextInt();
				break;
		    } catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("Average Man-hours of Complex Report Type : ");
				scan.next();
				repeat = true;
		    }
		}
		er = new ContextER(new CalSimpleReportMhEstimate());
		complexRT = er.executeEstimatingReport(qty, averageMH);
		System.out.println("Sub total for Complex Report Type is " + complexRT);
		System.out.println("--------------------------------------------------------");
		
		totalRT = simpleRT + averageRT + complexRT;
		System.out.println("Total Report Man-hour Estimate is " + totalRT);
		System.out.println("--------------------------------------------------------");
		
		System.out.printf("Total Man-hours are %.2f" , getTotalManHours());
		System.out.println("\n----------------------------------------------------------");
	}
	
	@Override
	public int calculationEstimationManHour(int qty, int averageMH) {
		return 0;
	}
}
