package NullPointerEx;



public class NullPointerExceptionExTest {

	
	public static void main(String[] args){
		NullPointerExceptionEx  p = new NullPointerExceptionEx();
			p=null;	
		try {
			p.getId();
			//System.out.println(p.getId());
			
		}catch(Exception e){
			System.out.println("Please enter id, should not be null ");
			
		}
	
	}
	
}
