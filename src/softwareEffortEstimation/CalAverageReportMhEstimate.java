package softwareEffortEstimation;

public class CalAverageReportMhEstimate implements EstimatingReportType {
	@Override
	public int calculationEstimationManHour(int qty, int averageMH) {
		return qty * averageMH;
	}
}