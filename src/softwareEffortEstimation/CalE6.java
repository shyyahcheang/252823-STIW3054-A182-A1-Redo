package softwareEffortEstimation;

public class CalE6 implements ExperienceFactor {
	@Override
	public double calculationEFactor(int num1, double num2) {
		num2 = 2.0;
		return num1 * num2;
	}
}
