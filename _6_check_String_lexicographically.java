/*2.	Write a Java program to compare two strings lexicographically.
Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.
                                                                                                                         

3.	Write a Java program to compare two strings lexicographically, ignoring case differences.
String 1: This is exercise 1                                                                                  
String 2: This is Exercise 1                                                                                  
"This is exercise 1" is equal to "This is Exercise 1"*/

public class _6_check_String_lexicographically {

    public static void main(String[] args) {
        String str1="I love Mango";
        String str2="i love Mango";
        int count=0;
        if(str1.length()==str2.length())
        {
            for(int i=0;i<str1.length();i++)
            {
                if(str1.charAt(i)==str2.charAt(i) )
                {
                    count++;
                }
             char c1= str1.charAt(i);
             char c2=str2.charAt(i);
             if((c1+32)==c2)
             {
                count++;
             }
             if((c1-32)==c2)
             {
                count++;
             }
            }
        }
        else{
            System.out.println("length are not same of both the string");
        }
        if(count==str1.length() && count==str2.length())
        {
            System.out.println("the strings are same lexicographically");
        }
    
        else{
            System.out.println("Strings are not same lexicographically");
        }
    }
    
}
