package arrays;
import java.util.Scanner;

public class addingArraysofDifferentSize {

	public static void main(String[] args) {
		        int[]a=toRead();
				int[]b=toRead();
				int[] res=toMerge(a,b);
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
			public static int[] toMerge(int[]a,int[]b)
			
			{
				int[]c= new int[a.length+b.length];
				int i=0;
				int j=0;
				while(i<a.length&&i<b.length)
				{
					c[j]=a[i];
					j++;
					c[j]=b[i];
					i++;
					j++;
					
				}
				while(i<a.length)
				{
					c[j]=a[i];
					i++;
					j++;
				}
				while(i<b.length)
				{
					c[j]=b[i];
					i++;
					j++;
					
				}
				
				return c;
				
			}
}


