package Examples;

public class Circle extends Shape1 implements ShapeConstants{
		
		double radius;
		public Circle(double radius){
		this.radius=radius;
	}
	
	@Override
	public double calculateArea() {
		double area;
		
		area=ShapeConstants.pi*radius*radius;
		return area;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter;
		perimeter = 2*ShapeConstants.pi*radius;
		return perimeter;
	}

	@Override
	public int setSides() {
		int noOfSides=0;
		System.out.println("The number of sides is Zero.");
		return noOfSides;
	}	
	
}
