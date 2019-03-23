package softwareEffortEstimation;

public class CalAverageUseCase implements UseCasesType {
	@Override
	public int calculationUseCases(int num1, int num2) {
		num2 = 10;
		return num1 * num2;
	}
}