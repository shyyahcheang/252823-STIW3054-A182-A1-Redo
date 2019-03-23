package softwareEffortEstimation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseCases extends ActorPoints implements UseCasesType {

	private Scanner scan;
	private int simpleUC, averageUC, complexUC, totalUC;
	static int unadjustedUCP;
	
	public UseCases() {
		
	}
	
	public UseCases(int totalAT, int unadjustedUCP) {
		super(totalAT);
		UseCases.unadjustedUCP = unadjustedUCP;
	}
	
	public int getUnadjustedUCP() {
		unadjustedUCP = totalUC + totalAT;
		return unadjustedUCP;
	}
	
	public void weightingUseCases() {
		
		scan = new Scanner(System.in);
		boolean repeat = true;
		int num1 = 0, num2 = 0;
		
		System.out.print("Simple - 3 or fewer transactions : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
	    		System.out.print("Simple - 3 or fewer transactions : ");
	    		scan.next();
	    		repeat = true;
			}
		}
		System.out.println("Weight Factor : 5");
		ContextUC uc = new ContextUC(new CalSimpleUseCase());
		simpleUC = uc.executeUseCases(num1,num2);
		System.out.println("Sub total for Simple Use Case is " + simpleUC);
		System.out.println("------------------------------------------------------");
		
		System.out.print("Average - 4 to 7 transactions : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
	    		System.out.print("Average - 4 to 7 transactions : ");
	    		scan.next();
	    		repeat = true;
			}
		}
		System.out.println("Weight Factor : 10");
		uc = new ContextUC(new CalAverageUseCase());
		averageUC = uc.executeUseCases(num1, num2);
		System.out.println("Sub total for Average Use Case is " + averageUC);
		System.out.println("------------------------------------------------------");
		
		System.out.print("Complex - Greater than 7 transactions : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
	    		System.out.print("Complex - Greater than 7 transactions : ");
	    		scan.next();
	    		repeat = true;
			}
		}
		System.out.println("Weight Factor : 15");
		uc = new ContextUC(new CalComplexUseCase());
		complexUC = uc.executeUseCases(num1, num2);
		System.out.println("Sub total for Complex Use Case is " + complexUC);
		System.out.println("------------------------------------------------------");
		
		totalUC = simpleUC + averageUC + complexUC;
		System.out.println("Total Use Cases are " + totalUC);
		System.out.println("------------------------------------------------------");
		
		System.out.println("Unadjusted Use Case Points are " + getUnadjustedUCP());
		System.out.println("------------------------------------------------------");
	}
	
	@Override
	public int calculationUseCases(int num1, int num2) {
		return 0;
	}
	
}
