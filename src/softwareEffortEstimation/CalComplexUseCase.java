package softwareEffortEstimation;

public class CalComplexUseCase implements UseCasesType {
	@Override
	public int calculationUseCases(int num1, int num2) {
		num2 = 15;
		return num1 * num2;
	}
}