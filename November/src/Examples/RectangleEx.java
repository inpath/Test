package Examples;

public class RectangleEx extends Shape{
	double area,perimeter;
	int noOfSides;
	
	@Override
	public  void calculateArea(double length,double width){
	
	 area = length*width;
	 System.out.println("The area of rectangle  : "+area);
	}


	public void calculatePerimeter(double length, double width) {
		
		perimeter = 2*(width+length);
		System.out.println("The perimeter  : "+perimeter);
	}
	public int setSides(int noOfSides){
		this.noOfSides=noOfSides;
		System.out.println("Number of sides is : "+this.noOfSides);
		return this.noOfSides;
	}
}
