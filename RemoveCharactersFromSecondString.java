package Zoho;
import java.util.*;
public class RemoveCharactersFromSecondString {
    public static void main(String[] args) {
        String s1="computer";
        String s2="cat";
        System.out.println(removeChars(s1,s2));

    }
    static String removeChars(String string1, String string2){
        //create a new string
        String remove="";
        for(int i=0;i<string1.length();i++)
        {
            //when string 2 doesnot contain the character at string1
            //we can check string 1 in string 2
            //but index becomes out of bounds
            if(!(string2.contains(String.valueOf(string1.charAt(i)))))
                remove+=string1.charAt(i);
            //appending the character to new string

        }
        return remove;
    }
}
