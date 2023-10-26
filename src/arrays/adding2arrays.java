package arrays;
import java.util.Scanner;

public class adding2arrays {
	public static void main(String[] args) {
			int[]a=toRead();
			int[]b=toRead();
			int res[]=tomerge(a,b);
			display(res);
		}
		public static int[] toRead()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of an array");
			int size=sc.nextInt();
			System.out.println("enter the elements of an array");
			int[]a=new int[size];
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			return a;
		}
		public static void display(int[]a)
				{
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
				}
			
		
		public static int[] tomerge(int[]a,int[]b)
		{
			
			int[]c=new int[a.length+b.length];
			for(int i=0;i<a.length;i++) {
				c[i]=a[i];
			}
			for(int i=0;i<b.length;i++) {
				c[a.length+i]=b[i];
			}
			return c;
			}
			
			
		}





