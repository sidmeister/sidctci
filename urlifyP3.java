/*
Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters,and that you are given the "true" length of the string

Example 
Input : "Mr John Smith    ",13
Output :"Mr%20John%20Smith"
*/

public class urlifyP3 {

	public char[] Solution(char[] str, int truelength)
	{
		int spacecount = 0;
		//count the number of spaces;
		for(int i=0;i<truelength;i++)
		{
			if(str[i] == ' ')
				spacecount++;
		}
		int index = truelength + spacecount*2;
		if(truelength < str.length) str[truelength] = '\0';
		for(int i=truelength -1;i>=0;i--)
		{
			if(str[i] == ' ')
			{
				str[index -1] = '0';
				str[index -2] = '2';
				str[index -3] = '%';
				index = index -3;
			}
			else
			{
				str[index - 1] = str[i];
				index--;
			}
		}
		return str;
	}
	
	public static void main(String[] args)
	{
		urlifyP3 p = new urlifyP3();
		char[] arr = p.Solution(new String("Mr John Smith    ").toCharArray(),13);  
		String text = String.copyValueOf(arr);
		System.out.println(text);   
		
	}

}