package softwareEffortEstimation;

public class CalComplexReportMhEstimate implements EstimatingReportType {
	@Override
	public int calculationEstimationManHour(int qty, int averageMH) {
		return qty * averageMH;
	}
}
