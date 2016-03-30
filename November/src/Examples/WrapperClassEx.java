package Examples;

public class WrapperClassEx {
	

		public static void main(String[] args) {
			int i=10;
			//primitive to wrapper
			Integer I=new Integer(i); // not good
			//Integer i1=Integer.valueOf(i); // good practice
			//Integer i2=i;//autoboxing
			System.out.println(I);
			System.out.println(I.toString());
			//wrapper to primitive
			Integer J=new Integer(3);
			int k=J.intValue();

			int a=J;//unboxing
			System.out.println(k);
			System.out.println(a);
			
		}

}
