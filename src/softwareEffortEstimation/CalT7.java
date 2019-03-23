package softwareEffortEstimation;

public class CalT7 implements TechnicalFactor {
	@Override
	public double calculationTFactor(int num1, double num2) {
		num2 = 0.5;
		return num1 * num2;
	}
}
