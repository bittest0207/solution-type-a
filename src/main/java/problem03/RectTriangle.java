package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	private double s;
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return width * height * 0.5;
		//return Math.sqrt(s)
		//Math.sqrt
		 
 	}

	@Override
	public double getPerimeter() {
		//Math.sqrt(a)
		return 0.;
	}
}
