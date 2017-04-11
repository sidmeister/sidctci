/*
Assume you have a method isSubString which checks if one word is a substring of another. Given two strings, s1 and s2 write code to check if s2 is a rotation of s1 using only one call to isSubString(e. "waterbottle" is a rotation of "erbottlewat")
*/


public class stringRotationP9 {

    public void Solution(String s1, String s2)
    {
        int s1len = s1.length();
        if(s1len == s2.length() && s1len >0)
        {
            /*Concat s1 and s2 within new buffer"*/
            String s1s1 = s1+s1;
            return   s1s1.isSubString(s2);
        }
        return false;
    }

    public static void main(String[] args){
        stringRotationP9 p = new stringRotationP9();
        p.Solution("waterbottle","erbottlewat");
    }
}