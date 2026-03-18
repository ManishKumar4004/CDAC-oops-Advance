package interface3;

public class Circle implements Colorfull{


	@Override
	public void Draw() {
		System.out.println("Circle Draw...");
	}

	@Override
	public void calculateArea(double n) {
        double d = 3.14*n*n;
		System.out.println("Area of circle :"+d);
	}

	@Override
	public void fillcolor(String c) {
		System.out.println(c+" color filled in circle ...");
		
	}
	
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.Draw();
		c.calculateArea(4.4);
		c.fillcolor("Red");
	}
	
	

}
