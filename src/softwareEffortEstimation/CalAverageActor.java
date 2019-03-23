package softwareEffortEstimation;

public class CalAverageActor implements ActorType {
	@Override
	public int calculationActorPoint(int num1, int num2) {
		num2 = 2;
		return num1 * num2;
	}
}