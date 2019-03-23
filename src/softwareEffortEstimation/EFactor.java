package softwareEffortEstimation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EFactor extends TFactor implements ExperienceFactor {
	
	private Scanner scan;
	private double e1, e2, e3, e4, e5, e6, e7, e8, totalEFactor, efactor;
	static double ucp;
	
	public EFactor () {
		
	}
	
	public EFactor(int totalAT, int unadjustedUCP, double sizeUC, double ucp) {
		super(totalAT, unadjustedUCP, sizeUC);
		EFactor.ucp = ucp;
	}

	public double getUcp() {
		ucp = efactor * sizeUC;
		return ucp;
	}
	
	public void weightingExperienceFactors() {
		
		scan = new Scanner(System.in);
		boolean repeat = true;
		int num1 = 0;
		double num2 = 0.0;
		
		System.out.print("E1 - Familiar with FPT software process : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF e = new ContextEF(new CalE1());
						e1 = e.executeExperienceFactors(num1, num2);
					} else {
						ContextEF e = new ContextEF(new CalE1());
						e1 = e.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("E1 - Familiar with FPT software process : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF er = new ContextEF(new CalE1());
						e1 = er.executeExperienceFactors(num1, num2);
					} else {
						ContextEF er = new ContextEF(new CalE1());
						e1 = er.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 1.0");
		System.out.println("Sub total for E1 Factor is " + e1);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("E2 - Application experience : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF e = new ContextEF(new CalE2());
						e2 = e.executeExperienceFactors(num1, num2);
					} else {
						ContextEF e = new ContextEF(new CalE2());
						e2 = e.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("E2 - Application experience : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF er = new ContextEF(new CalE2());
						e2 = er.executeExperienceFactors(num1, num2);
					} else {
						ContextEF er = new ContextEF(new CalE2());
						e2 = er.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 0.5");
		System.out.println("Sub total for E2 Factor is " + e2);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("E3 - Paradigm experience (OO) : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF e = new ContextEF(new CalE3());
						e3 = e.executeExperienceFactors(num1, num2);
					} else {
						ContextEF e = new ContextEF(new CalE3());
						e3 = e.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("E3 - Paradigm experience (OO) : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF er = new ContextEF(new CalE3());
						e3 = er.executeExperienceFactors(num1, num2);
					} else {
						ContextEF er = new ContextEF(new CalE3());
						e3 = er.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 1.0");
		System.out.println("Sub total for E3 Factor is " + e3);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("E4 - Lead analyst capability : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF e = new ContextEF(new CalE4());
						e4 = e.executeExperienceFactors(num1, num2);
					} else {
						ContextEF e = new ContextEF(new CalE4());
						e4 = e.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("E4 - Lead analyst capability : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF er = new ContextEF(new CalE4());
						e4 = er.executeExperienceFactors(num1, num2);
					} else {
						ContextEF er = new ContextEF(new CalE4());
						e4 = er.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 0.5");
		System.out.println("Sub total for E4 Factor is " + e4);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("E5 - Motivation : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF e = new ContextEF(new CalE5());
						e5 = e.executeExperienceFactors(num1, num2);
					} else {
						ContextEF e = new ContextEF(new CalE5());
						e5 = e.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("E5 - Motivation : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF er = new ContextEF(new CalE5());
						e5 = er.executeExperienceFactors(num1, num2);
					} else {
						ContextEF er = new ContextEF(new CalE5());
						e5 = er.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 0.0");
		System.out.println("Sub total for E5 Factor is " + e5);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("E6 - Stable requirements : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF e = new ContextEF(new CalE6());
						e6 = e.executeExperienceFactors(num1, num2);
					} else {
						ContextEF e = new ContextEF(new CalE6());
						e6 = e.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("E6 - Stable requirements : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF er = new ContextEF(new CalE6());
						e6 = er.executeExperienceFactors(num1, num2);
					} else {
						ContextEF er = new ContextEF(new CalE6());
						e6 = er.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 2.0");
		System.out.println("Sub total for E6 Factor is " + e6);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("E7 - Part-time workers : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF e = new ContextEF(new CalE7());
						e7 = e.executeExperienceFactors(num1, num2);
					} else {
						ContextEF e = new ContextEF(new CalE7());
						e7 = e.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("E7 - Part-time workers : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF er = new ContextEF(new CalE7());
						e7 = er.executeExperienceFactors(num1, num2);
					} else {
						ContextEF er = new ContextEF(new CalE7());
						e7 = er.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : -1.0");
		System.out.println("Sub total for E7 Factor is " + e7);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("E8 - Difficulty of programming language : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF e = new ContextEF(new CalE8());
						e8 = e.executeExperienceFactors(num1, num2);
					} else {
						ContextEF e = new ContextEF(new CalE8());
						e8 = e.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("E8 - Difficulty of programming language : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextEF er = new ContextEF(new CalE8());
						e8 = er.executeExperienceFactors(num1, num2);
					} else {
						ContextEF er = new ContextEF(new CalE8());
						e8 = er.executeExperienceFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : -1.0");
		System.out.println("Sub total for E8 Factor is " + e8);
		System.out.println("--------------------------------------------------------");
		
		totalEFactor = e1 + e2 + e3 + e4 + e5 + e6 + e7 + e8;
		System.out.printf("Total Experience Factor are %.2f", totalEFactor);
		System.out.println("\n--------------------------------------------------------");
		
		efactor = ((-0.03) * totalEFactor) + 1.4;
		System.out.printf("Experience Factor (EF) is %.2f", efactor);
		System.out.println("\n--------------------------------------------------------");
		
		System.out.printf("Use Case Points (UCP) is %.2f", getUcp());
		System.out.println("\n--------------------------------------------------------");
	}
	
	@Override
	public double calculationEFactor(int num1, double num2) {
		return 0;
	}
}
