/*
Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would becom a2b1c5a3. If the "compressed" string would not become smaller than the original string,your metho should return the original string.You can assume the string has only uppercase and lowercase letters(a-z)
*/

public class StringCompressionP6
{
	public String Solution(String str)
	{
		if(str == "" || str ==null || str.length() <=1) return str;
		StringBuilder out = new StringBuilder();
		char curr_char = '\0';
		char prev_char = '\0';
		int count =1;
		for(int i =0;i<str.length();i++)
		{
			curr_char = str.charAt(i);
			if(curr_char == prev_char)
				count++;
			else
			{
					if(prev_char != '\0')
					{
						out.append(prev_char);
						out.append(count);
						count = 1;
					}
			}
			prev_char = curr_char;
		}
		out.append(curr_char);
		out.append(count);

		if (out.toString().length() > str.length())
		return str;
		else
		return out.toString();
	}

	public static void main(String[] args)
	{
		StringCompressionP6 s = new StringCompressionP6();
		System.out.println(s.Solution("aabcccccaaa"));
		System.out.println(s.Solution("abc"));
		System.out.println(s.Solution("aab"));
		System.out.println(s.Solution(""));
	}
}
