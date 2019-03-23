package softwareEffortEstimation;

public class CalSimpleUseCase implements UseCasesType{
	@Override
	public int calculationUseCases(int num1, int num2) {
		num2 = 5;
		return num1 * num2;
	}
}