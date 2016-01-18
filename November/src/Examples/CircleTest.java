package Examples;

public class CircleTest {

	public static void main (String [] args){
	
		Shape1 s = new Circle(10);
	
		System.out.println("The area of circle is : "+ s.calculateArea());
		
		System.out.println("The perimeter of circle is : "+s.calculatePerimeter());
		s.setSides();		
		
	}
		
}
