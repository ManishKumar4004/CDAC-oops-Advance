package BOX;

public class Box3d extends Box{
	
	public Box3d(int length, int breath, int height) {
		super(length, breath, height);
		
	}
	public void Area() {
		System.out.println("Area: "+getLength()*getBreath());
	}
	public void volume() {
		System.out.println("Volume: "+getLength()*getBreath()*getHeight());
	}
	
	public static void main(String[] args) {
		Box3d b1 = new Box3d(1,2,3);
		b1.Area();
		b1.volume();
	}
	
}
