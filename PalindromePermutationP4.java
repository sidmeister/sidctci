/*
Palindrome Permutation: Given a string, write a fn to check if it is a permutation of a palindrome.
*/
public class PalindromePermutationP4 {

    public boolean Solution(String str)
    {
        int[] freq = buildFrequency(str);
        return checkPalindrome(freq);
    }

    public boolean checkPalindrome(int[] freq)
    {
        boolean isOdd = false;
        for(int i =0; i<freq.length;i++)
        {
            if(freq[i]%2 == 1)
            {
                if(isOdd)
                    return false;
                isOdd = true;
            }
        }
        return isOdd;
    }

    public int[] buildFrequency(String str)
    {
     int[] letter = new int[36];
        for(int i =0;i<str.length();i++)
        {
            char c = str.charAt(i);
            int val = getCharNumber(c);
            if(val != -1)
                letter[val]++;
        }
        return letter;
    }

    public int getCharNumber(char c)
    {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if(val >=a && val <=z)
            return val -a;
        return -1;
    }

    public static void main(String[] args){
        PalindromePermutationP4 p = new PalindromePermutationP4();
        System.out.println(p.Solution("Tact Coa"));
    }
}