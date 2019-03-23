package softwareEffortEstimation;

public class CalSimpleReportMhEstimate implements EstimatingReportType {
	@Override
	public int calculationEstimationManHour(int qty, int averageMH) {
		return qty * averageMH;
	}
}
