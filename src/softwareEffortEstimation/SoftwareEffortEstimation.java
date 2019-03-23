package softwareEffortEstimation;

import java.util.Scanner;

public class SoftwareEffortEstimation {
	
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		char ans;
		
		do {
			System.out.println("Weighting Actors for Complexity");
			System.out.println("===============================");
			ActorPoints ap = new ActorPoints();
			ap.weightingActors();
			
			System.out.println("\nWeighting Use Cases for Complexity");
			System.out.println("==================================");
			UseCases uc = new UseCases();
			uc.weightingUseCases();
			
			System.out.println("\nWeighting Technical Factors");
			System.out.println("===========================");
			TFactor t = new TFactor();
			t.weightingTechnicalFactors();
			
			System.out.println("\nWeighting Experience Factors");
			System.out.println("============================");
			EFactor e = new EFactor();
			e.weightingExperienceFactors();
			
			System.out.println("\nCalculating Man-hours from UCP");
			System.out.println("==============================");
			ManHours mh = new ManHours();
			mh.calculatingManHours();
			
			System.out.println("\nAdjusting Man-hours for Risk");
			System.out.println("============================");
			AdjustedManHours amh = new AdjustedManHours();
			amh.adjustingManHours();
			
			System.out.println("\nWeighting Reports for Complexity");
			System.out.println("================================");
			EstimatingReport er = new EstimatingReport();
			er.weightingReports();
			
			System.out.print("\nDo you want to calculate again? 'Y' / 'N' : ");
			ans = scan.next().charAt(0);
		
		} while (ans == 'Y');
	}

}
