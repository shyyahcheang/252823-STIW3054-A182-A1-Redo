package softwareEffortEstimation;

public class CalSimpleActor implements ActorType {
	@Override
	public int calculationActorPoint(int num1, int num2) {
		num2 = 1;
		return num1 * num2;
	}
}