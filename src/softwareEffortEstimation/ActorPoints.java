package softwareEffortEstimation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ActorPoints extends SoftwareEffortEstimation implements ActorType {
	
	private Scanner scan;
	private int simpleAT, averageAT, complexAT;
	static int totalAT;
	
	public ActorPoints() {
		
	}
	
	public ActorPoints(int totalAT) {
		super();
		ActorPoints.totalAT = totalAT;
	}
	
	public int getTotalAT() {
		totalAT = simpleAT + averageAT + complexAT;
		return totalAT;
	}
	
	public void weightingActors() {
	
		scan = new Scanner(System.in);
		boolean repeat = true;
		int num1 = 0, num2 = 0;
		
		System.out.print("Simple - Defined API : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
        		System.out.print("Simple - Defined API : ");
        		scan.next();
        		repeat = true;
			}
		}
		System.out.println("Weight Factor : 1");
		ContextAT actor = new ContextAT(new CalSimpleActor());
		simpleAT = actor.executeActorPoints(num1,num2);
		System.out.println("Sub total for Simple Actor is " + simpleAT);
		System.out.println("------------------------------------------------------");
		
		System.out.print("Average - Interactive or Protocol driven interface : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
        		System.out.print("Average - Interactive or Protocol driven interface : ");
        		scan.next();
        		repeat = true;
			}
		}
		System.out.println("Weight Factor : 2");
		actor = new ContextAT(new CalAverageActor());
		averageAT = actor.executeActorPoints(num1,num2);
		System.out.println("Sub total for Average Actor is " + averageAT);
		System.out.println("------------------------------------------------------");
		
		System.out.print("Complex - Graphical User Interface : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				break;
			} catch(InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
        		System.out.print("Complex - Graphical User Interface : ");
        		scan.next();
        		repeat = true;
			}
		}
		System.out.println("Weight Factor : 3");
		actor = new ContextAT(new CalComplexActor());
		complexAT = actor.executeActorPoints(num1,num2);
		System.out.println("Sub total for Complex Actor is " + complexAT);
		System.out.println("------------------------------------------------------");
		
		System.out.println("Total Actor Points are " + getTotalAT());
		System.out.println("------------------------------------------------------");
	}

	@Override
	public int calculationActorPoint(int num1, int num2) {
		return 0;
	}

}
