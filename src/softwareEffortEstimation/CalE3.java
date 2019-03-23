package softwareEffortEstimation;

public class CalE3 implements ExperienceFactor {
	@Override
	public double calculationEFactor(int num1, double num2) {
		num2 = 1.0;
		return num1 * num2;
	}
}
