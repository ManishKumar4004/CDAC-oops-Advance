package Abstract;

// Rectangle class inherit shape class
public class Rectangle extends Shape{
    private float l;
    private float b;
    public Rectangle(float a,float b) {
    	super(); // default constructor call of parent class
    	l = a;
    	this.b = b;
    }
    @Override
	double Area() {
		double d = l*b;
		return d;
	}
    
	public static void main(String[] args) {
	   Rectangle r = new Rectangle(6,4);
	   System.out.println(r.Area());
	}
	
     
}
