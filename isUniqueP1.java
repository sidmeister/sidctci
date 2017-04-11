/*Implement an algo to determine if a string has all unique characters. What if you cannot use additional data structures*/

public class isUniqueP1
{
	public boolean Solution(String str)
	{
		int checker = 0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int val = ch - 'a';
			if((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		return true;
		
	}
	
	public static void main(String[] args)
	{
		isUniqueP1 p = new isUniqueP1();
		System.out.println(p.Solution("abc"));
		System.out.println(p.Solution("aac"));
	}
}