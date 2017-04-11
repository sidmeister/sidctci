/* Given two strings check if one is a permutation of the other*/

public class checkPermutationP2
{
	public boolean Solution(String str1, String str2)
	{
		//assuming the string is an ascii string
		if(str1.length() != str2.length())
			return false;
		if(str1.equals(str2))
			return true;
		int[] arr = new int[128];
		char[] c1 = str1.toCharArray();
		for(char c : c1)
		{
			arr[c]++;
		}
		char[] c2 = str2.toCharArray();
		for(char c : c2)
		{
			int len = arr[c];
			if(len ==0)
				return false;
			else
				arr[c]--;
		}
		return true;
	}

	public static void main(String[] args)
	{
		checkPermutationP2 p = new checkPermutationP2();
		System.out.println(p.Solution("",""));
		System.out.println(p.Solution("","abc"));
		System.out.println(p.Solution("abc","bac"));
		System.out.println(p.Solution("aac","abc"));
		System.out.println(p.Solution("def","ghi"));
	}
}