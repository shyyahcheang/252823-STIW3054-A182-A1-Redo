package softwareEffortEstimation;

public class CalT1 implements TechnicalFactor{
	@Override
	public double calculationTFactor(int num1, double num2) {
		num2 = 2.0;
		return num1 * num2;
	}
}