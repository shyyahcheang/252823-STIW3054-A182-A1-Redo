package softwareEffortEstimation;

public class CalT4 implements TechnicalFactor {
	@Override
	public double calculationTFactor(int num1, double num2) {
		num2 = 1.0;
		return num1 * num2;
	}
}
