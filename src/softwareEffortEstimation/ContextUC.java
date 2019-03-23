package softwareEffortEstimation;

public class ContextUC {
	private UseCasesType useCase;
	
	public ContextUC (UseCasesType useCase) {
		this.useCase = useCase;
	}
	
	public int executeUseCases(int num1, int num2) {
		return useCase.calculationUseCases(num1, num2);
	}
}