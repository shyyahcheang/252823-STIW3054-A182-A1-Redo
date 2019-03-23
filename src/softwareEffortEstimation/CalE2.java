package softwareEffortEstimation;

public class CalE2 implements ExperienceFactor {
	@Override
	public double calculationEFactor(int num1, double num2) {
		num2 = 0.5;
		return num1 * num2;
	}
}
