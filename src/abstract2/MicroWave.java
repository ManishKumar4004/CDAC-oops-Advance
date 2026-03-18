package abstract2;

public class MicroWave extends Applience{

	
	public MicroWave(String a,String b){
		super(a,b);
	}
	
	@Override
	public void turnOn() {
		System.out.println("MicroWave turnOn...");
		
	}
	
}
