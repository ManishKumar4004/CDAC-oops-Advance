package abstract2;

public class WashingMachine extends Applience{

	public WashingMachine(String a,String b) {
		super(a,b);
	}
	@Override
	public void turnOn() {
		System.out.println("WashingMachine TurnOn...");
	}
	
	
}
