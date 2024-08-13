package Day07.Ex01_Shape;

public class Rectangle extends Shape {
	
	double a, b;

	public Rectangle() {
		this(0.0, 0.0);
	}

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]";
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return 2*(a + b);
	}

	
}

	