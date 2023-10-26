package strings;

public class reversestringwithtsplit {

	public static void main(String[] args) {
		String s="all the best";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			int k=i;
			while(i>=0 && ch[i]!=" ")
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				s=s+ch[j];
				j++;
			if(i>=0) {
				s=s+ch[i];
			}
		}
		System.out.println(s);

	}

}
}