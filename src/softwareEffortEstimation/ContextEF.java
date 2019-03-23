package softwareEffortEstimation;

public class ContextEF {
	private ExperienceFactor experience;
	
	public ContextEF(ExperienceFactor experience) {
		this.experience = experience;
	}
	
	public double executeExperienceFactors(int num1, double num2) {
		return experience.calculationEFactor(num1, num2);
	}
}