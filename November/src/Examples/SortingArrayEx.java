package Examples;



public class SortingArrayEx {

	int min,j;
	
	void largest(int[] arr2)
	{
		int min = arr2[0];
		
		for (j=0;j< arr2.length-1; j++)
		{
		/*boolean sort=false;
		while(sort==false)
		{
			sort=true;*/		
		for (int i = 0;i < arr2.length-1;i++)
		{
			if (arr2[i] > arr2[i+1])
			{
				min = arr2[i+1];
				arr2[i+1] = arr2[i];
				arr2[i]=min;
				//sort=false;
			}
				}
				
				}
	
			for (int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}
	
	
	public static void main(String[] args)
	{
		int[] arr1 = {22,11,5,4,3};
		SortingArrayEx sa = new SortingArrayEx();
		System.out.println("The ascending order is ");
		sa.largest(arr1);
		
			
	}

}
