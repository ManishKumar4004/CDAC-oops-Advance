package Abstract;

// Circle class extends Shape class
class Circle extends Shape {
	private double Radius;
	
	public Circle(double a) {
		super();  // default constructor call of Shape class 
		Radius = a;
	}

	//Override Area() of Shape class
	@Override
	double Area() {      // override Area method
		double a = 3.14*Radius*Radius;
		return a;
	}
	public static void main(String[] args) {
		// object create of Circle class reference
		Circle c = new Circle(1);
		System.out.println(c.Area());
	}
	
     
}
