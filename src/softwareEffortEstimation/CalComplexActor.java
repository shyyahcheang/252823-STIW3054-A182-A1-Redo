package softwareEffortEstimation;

public class CalComplexActor implements ActorType{
	@Override
	public int calculationActorPoint(int num1 , int num2) {
		num2 = 3;
		return num1 * num2;
	}
}