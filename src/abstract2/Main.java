package abstract2;

public class Main {
    public static void main(String[] args) {
    	MicroWave m  =new MicroWave("Panasonic","1 Unit/H");
		m.turnOn();
		System.out.println();
		Refrigerator r  = new Refrigerator("L.G","1Unit/H");
		r.turnOn();
		System.out.println();
		WashingMachine w  =new WashingMachine("Samsung","3Unit/H");
		w.turnOn();
	}
}
