package softwareEffortEstimation;

public class CalT2 implements TechnicalFactor {
	@Override
	public double calculationTFactor(int num1, double num2) {
		num2 = 1.0;
		return num1 * num2;
	}
}