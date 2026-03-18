package interface5;

public class Main{

	public static void generatgreeting(){
        Greeting g = new Greeting() {
			@Override
			public void SayHello(){
				System.out.println("hello,congratulations...");
			}
		};
		g.SayHello();
	} 
	public static void main(String[] args) {
		generatgreeting();
	}
}
