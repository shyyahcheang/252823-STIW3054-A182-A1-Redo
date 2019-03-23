package softwareEffortEstimation;

public class ContextER {
	private EstimatingReportType estimating;
	
	public ContextER(EstimatingReportType estimating) {
		this.estimating = estimating;
	}
	
	public int executeEstimatingReport(int qty, int averageMH) {
		return estimating.calculationEstimationManHour(qty, averageMH);
	}
}