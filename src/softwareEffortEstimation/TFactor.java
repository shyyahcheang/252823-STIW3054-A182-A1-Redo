package softwareEffortEstimation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TFactor extends UseCases implements TechnicalFactor {
	
	private Scanner scan;
	private double t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, totalTFactor, tcf;
	static double sizeUC;
	
	public TFactor() {
		
	}
	
	public TFactor(int totalAT, int unadjustedUCP, double sizeUC) {
		super(totalAT, unadjustedUCP);
		TFactor.sizeUC = sizeUC;
	}
	
	public double getSizeUC() {
		sizeUC = tcf * unadjustedUCP;
		return sizeUC;
	}
	
	public void weightingTechnicalFactors() {
		
		scan = new Scanner(System.in);
		boolean repeat = true;
		int num1 = 0;
		double num2 = 0.0;
		
		System.out.print("T1 - Must have a distributed solution : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT1());
						t1 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT1());
						t1 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T1 - Must have a distributed solution : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT1());
						t1 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT1());
						t1 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 2.0");
		System.out.println("Sub total for T1 Factor is " + t1);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("T2 - Must respond to specific performance objectives : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT2());
						t2 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT2());
						t2 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T2 - Must respond to specific performance objectives : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT2());
						t2 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT2());
						t2 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 1.0");
		System.out.println("Sub total for T2 Factor is " + t2);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("T3 - Must meet end-user efficiency desires : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT3());
						t3 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT3());
						t3 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T3 - Must meet end-user efficiency desires : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT3());
						t3 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT3());
						t3 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 1.0");
		System.out.println("Sub total for T3 Factor is " + t3);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("T4 - Complex internal processing : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT4());
						t4 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT4());
						t4 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T4 - Complex internal processing : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT4());
						t4 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT4());
						t4 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 1.0");
		System.out.println("Sub total for T4 Factor is " + t4);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("T5 - Code must be reusable : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT5());
						t5 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT5());
						t5 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T5 - Code must be reusable : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT5());
						t5 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT5());
						t5 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 1.0");
		System.out.println("Sub total for T5 Factor is " + t5);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("T6 - Must be easy to install : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT6());
						t6 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT6());
						t6 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T6 - Must be easy to install : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT6());
						t6 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT6());
						t6 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 0.5");
		System.out.println("Sub total for T6 Factor is " + t6);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("T7 - Must be easy to use : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT7());
						t7 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT7());
						t7 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T7 - Must be easy to use : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT7());
						t7 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT7());
						t7 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 0.5");
		System.out.println("Sub total for T7 Factor is " + t7);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("T8 - Must be portable : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT8());
						t8 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT8());
						t8 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T8 - Must be portable : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT8());
						t8 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT8());
						t8 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 2.0");
		System.out.println("Sub total for T8 Factor is " + t8);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("T9 - Must be easy to change : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT9());
						t9 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT9());
						t9 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T9 - Must be easy to change : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT9());
						t9 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT9());
						t9 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 1.0");
		System.out.println("Sub total for T9 Factor is " + t9);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("T10 - Must allow concurrent users : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT10());
						t10 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT10());
						t10 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T10 - Must allow concurrent users : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT10());
						t10 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT10());
						t10 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 1.0");
		System.out.println("Sub total for T10 Factor is " + t10);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("T11 - Includes special security features : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT11());
						t11 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT11());
						t11 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T11 - Includes special security features : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT11());
						t11 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT11());
						t11 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 1.0");
		System.out.println("Sub total for T11 Factor is " + t11);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("T12 - Must provide direct access for 3rd parties : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT12());
						t12 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT12());
						t12 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T12 - Must provide direct access for 3rd parties : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT12());
						t12 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT12());
						t12 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 1.0");
		System.out.println("Sub total for T12 Factor is " + t12);
		System.out.println("--------------------------------------------------------");
		
		System.out.print("T13 - Requires special user training facilities : ");
		while (repeat) {
			try {
				num1 = scan.nextInt();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT13());
						t13 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT13());
						t13 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please key in an integer number.");
				System.out.print("T13 - Requires special user training facilities : ");
				scan.next();
				do {
					if (num1 < 0 || num1 > 5) {
						System.out.print("Please enter rating from 0 to 5 : ");
						num1 = scan.nextInt();
						ContextTF t = new ContextTF(new CalT13());
						t13 = t.executeTechnicalFactors(num1, num2);
					} else {
						ContextTF t = new ContextTF(new CalT13());
						t13 = t.executeTechnicalFactors(num1, num2);
					}
				} while (num1 != 0 && num1 != 1 && num1 != 2 && num1 != 3 &&
						num1 != 4 && num1 != 5);
				repeat = true;
			}
		}
		System.out.println("Weight Factor : 1.0");
		System.out.println("Sub total for T13 Factor is " + t13);
		System.out.println("--------------------------------------------------------");
		
		totalTFactor = t1 + t2 + t3 + t4 + t5 + t6 + t7 + t8 + t9 + t10 + t11 + t12 + t13;
		System.out.printf("Total Technical Factor are %.2f" , totalTFactor);
		System.out.println("\n--------------------------------------------------------");
		
		tcf = (0.01 * totalTFactor) + 0.6;
		System.out.printf("Technical Complexity Factor is %.2f" , tcf);
		System.out.println("\n--------------------------------------------------------");
		
		System.out.printf("Size of the Software (use case) is %.2f" , getSizeUC());
		System.out.println("\n--------------------------------------------------------");
	}
	
	@Override
	public double calculationTFactor(int num1, double num2) {
		return 0;
	}	
}
