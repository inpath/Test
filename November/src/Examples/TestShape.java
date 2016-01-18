package Examples;

import java.util.Scanner;

public class TestShape {

	
	public static void main(String [] args){
				
		int s1,sides;
	
	System.out.println("Enter number of sides : ");
	Scanner sc = new Scanner(System.in);
	sides = sc.nextInt();
	int [] totalSides = new int[sides];
	for(int i=0;i<=totalSides.length-1;i++)
		totalSides[i]=sc.nextInt();
		 
	System.out.println("hai");
	
	Shape s = new RectangleEx();
		s1=s.setSides(sides);
	
		if (s1 == 1){
			System.out.println("The shape is circle.");
			
		}else if(s1 == 2){
			System.out.println("The shape is rectangle.");
			double l=totalSides[0];
			double w=totalSides[1];
			System.out.println(totalSides[0]+", "+totalSides[1]);
			s.calculateArea(l,w);
			s.calculatePerimeter(l, w);
		}else if (sides == 3){
			System.out.println("The shape is triangle.");
		}else if (sides == 4){
			System.out.println("The shape is quadrilateral");
		}
//		s.calculateArea(2,4);
//		s.calculatePerimeter(3,6);
		sc.close();
	}
	
}
