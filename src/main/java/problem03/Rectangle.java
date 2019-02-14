package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double rate) {
		
	}

	@Override
	public double getArea() {
		
		return width * height * 1;
	}

	@Override
	public double getPerimeter() {
		return width * height * 0.6;
		
	}
}