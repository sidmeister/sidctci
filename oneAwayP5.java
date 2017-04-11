/*
    There are 3 types of edits that can be performed on string
    1) Insert a character
    2) Remove a character
    3) Replace a character
    Given two strings write a fn to check if they are one edit(or zero edits) away
    Example
    pale, ple -> true
    pales,pale -> true
    pale,bale -> true
    pale, bae -> false
*/


public class oneAwayP5 {

    public boolean Solution(String s1, String s2)
    {
        if(s1.length() == s2.length())
            return oneEditReplace(s1,s2);
        else if(s1.length() +1  == s2.length())
            return oneEditInsert(s1,s2);
        else if(s2.length() +1  == s1.length())
            return oneEditInsert(s2,s1);
        else
            return false;

    }

    public boolean oneEditReplace(String s1, String s2)
    {
        int index1 =0,index2 =0;
        boolean foundDiff = false;
        while(index1 <s1.length() && index2 < s2.length())
        {
            if(s1.charAt(index1) != s2.charAt(index2))
            {
                if(foundDiff)
                    return false;
                foundDiff = true;
            }
            index1++;
            index2++;
        }
        return foundDiff;
    }

    public boolean oneEditInsert(String s1, String s2)
    {
        int index1 =0,index2 =0;
        while(index1 <s1.length() && index2 < s2.length())
        {
            if(s1.charAt(index1) != s2.charAt(index2))
            {
                if(index2 != index1)
                    return false;
                index2++;
            }
            else
            {
                index1++;
                index2++;
            }
        }
        return true;
    }


    public static void main(String[] args){
        oneAwayP5 o = new oneAwayP5();
        System.out.println(o.Solution("pale","ple"));
        System.out.println(o.Solution("pales","pale"));
        System.out.println(o.Solution("pale","bale"));
        System.out.println(o.Solution("pale","bal"));
    }
}