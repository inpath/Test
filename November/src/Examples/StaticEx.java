package Examples;

public class StaticEx {

	/* The output is : 
This is in static block 
This is in constructor 
This is in static method 
	 */
	static int num=0;
	static int count = 0;
	public StaticEx()
	{
		count=count+1;
	System.out.println("This is constructor called count: "+count);
	}
	
	static
	{
	num=num+1;
		System.out.println("This is in static block "+num);
		
	}	
	static void firstMethod(int j)
	{
		
		System.out.println("This is in static method ");
	}
	
	public static void main(String[] args){
		StaticEx	st = new StaticEx();
		st.firstMethod(11);
		st.firstMethod(12);
		System.out.println(num);		
		System.out.println(count);	
		StaticEx st1 = new StaticEx();
		System.out.println(num);		
		System.out.println(count);	
	}
}
//If pbject is created agin again the constructor is called and count is increased.
/*The output is :
This is in static block 1
This is constructor called count: 1
This is in static method 
This is in static method 
1
1
This is constructor called 2
1
2
*/