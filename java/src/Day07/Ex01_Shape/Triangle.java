package Day07.Ex01_Shape;

public class Triangle extends Shape {

	double width, height;
	
	public Triangle() {
	}

	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		//삼각형의 넓이
		return width * height / 2;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		//삼각형의 둘레 = 3*width
		return 3 * width;
	}

	//getter, setter
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}

	//toString
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}

}
