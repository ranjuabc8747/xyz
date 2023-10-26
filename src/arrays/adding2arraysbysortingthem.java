package arrays;
import java.util.Scanner;

public class adding2arraysbysortingthem {

	public static void main(String[] args) {
		        int[]a=toRead();
				int[]b=toRead();
				int[] res=tosort(a,b);
				display(res);
			}
			public static int[] toRead()
			{
				Scanner s=new Scanner(System.in);
				System.out.println("enter the size of an array");
				int size=s.nextInt();
				int[]a=new int [size];
				System.out.println("enter the elements of an array");
				
				for(int i=0;i<a.length;i++)
				{
					 a[i]=s.nextInt();
					 }
				return a;
			}
			public static void display(int []a)
					{
				for(int i=0;i<a.length;i++)
				{
					System.out.println(a[i]);
				}
					}
			public static int[] tosort(int[]a,int[]b)
			
			{
				int[]c= new int[a.length+b.length];
				int i=0;
				int j=0;
				int k=0;
				while(i<a.length&&j<b.length)
				{
					if(a[i]<b[j])
						c[k]=a[i++];
					else
						c[k]=b[j++];
					k++;
					}
				while(i<a.length)
				{
					c[k++]=a[i++];
				}
				while(j<b.length)
					{
					c[k++]=b[j++];
					}
				
				return c;
				
			}
}


