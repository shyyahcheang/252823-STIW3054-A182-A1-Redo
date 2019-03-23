package softwareEffortEstimation;

public class CalE5 implements ExperienceFactor {
	@Override
	public double calculationEFactor(int num1, double num2) {
		num2 = 0.0;
		return num1 * num2;
	}
}
