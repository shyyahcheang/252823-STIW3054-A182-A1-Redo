package softwareEffortEstimation;

public class ContextAT {
	private ActorType actor;
	
	public ContextAT (ActorType actor) {
		this.actor = actor;
	}
	
	public int executeActorPoints(int num1 , int num2) {
		return actor.calculationActorPoint(num1 , num2);
	}
}