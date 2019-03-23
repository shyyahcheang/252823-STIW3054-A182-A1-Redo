package softwareEffortEstimation;

public class ContextTF {
	private TechnicalFactor technical;
	
	public ContextTF(TechnicalFactor technical) {
		this.technical = technical;
	}

	public double executeTechnicalFactors(int num1, double num2) {
		return technical.calculationTFactor(num1, num2);
	}
}
