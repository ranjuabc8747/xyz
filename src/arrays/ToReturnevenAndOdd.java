package arrays;

public class ToReturnevenAndOdd {

	public static void main(String[] args) {
		int[]a= {4,6,4,8,7,3};
		int count[]=count(a);
		System.out.println("even------"+count[0]);
		System.out.println("odd-------"+count[1]);
	}
	public static int[] count(int[]a)
	
	{
		int even=0;int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			
				even++;
			else
				odd++;
			
		}
		int[]count= {even,odd};
	return count;
	for(int i=0;i<a.length;i++)
	{
		count(a[i]%2==0);
	}
	}

}
