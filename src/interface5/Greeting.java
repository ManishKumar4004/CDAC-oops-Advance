package interface5;

public interface Greeting {
    void SayHello();
}

class Next implements Greeting{
	public void SayHello() {
		 System.out.println("Say hello calling...");
	 }
}


