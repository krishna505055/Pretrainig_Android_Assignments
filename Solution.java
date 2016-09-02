import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

    public static void main(String[] args) 
    {
            //Your code here
            startEnds se=new startEnds();
            System.out.println(se.startEnds1("aba"));
            
    }
}
class startEnds
{
    String startEnds1(String string)
    {
        int len = string.length();
        String finalop = "";
        String tmp = "";
    
    for(int i = 0;i < len;i++)
    {
        tmp += string.charAt(i);
        int tmplen = tmp.length();
        if(i<len / 2 && tmp.equals(string.substring(len-tmplen,len)))
        finalop = tmp;
    }
    return finalop;
    }
}