/*5.	Write a Java program to compare a given string to the specified character sequence.
Sample Output:
Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false*/


public class _8_compare_String {
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
            }
        }else{
            System.out.println("length are not same of both the string");
        }
        if(count==str1.length() && count==str2.length())
        {
            System.out.println("true");
        }
    
        else{
            System.out.println("false");
        }
    }
}
 //other method
 
  class StringComparison {

    public static void main(String[] args) {
        // Define the strings to compare
        String str1 = "example.com";
        String str2 = "example.com";
        String str3 = "Example.com";
        
        // Perform the comparisons
        boolean result1 = compareStrings(str1, str2);  // Case-sensitive comparison
        boolean result2 = compareStrings(str1, str3);  
        
        // Print the results
        System.out.println("Comparing " + str1 + " and " + str2 + ": " + result1);
        System.out.println("Comparing " + str1 + " and " + str3 + ": " + result2);
    }

    // Method to compare strings case-sensitively
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}


/*
6.	 Write a Java program to compare a given string to a specified string buffer.
Sample Output:
Comparing example.com and example.com: true                                                                   
Comparing Example.com and example.com: false */

class CompareUsingStringBuffer {
    public static void main(String[] args) {
        // Sample strings
        String str1 = "example.com1";
        String str2 = "Example.com";

        // Create StringBuffer instances
        StringBuffer sb1 = new StringBuffer(str1);
        StringBuffer sb2 = new StringBuffer(str2);

        // Convert StringBuffer to String and compare
        boolean comparison1 = str1.equals(sb1.toString());
        boolean comparison2 = str2.equals(sb1.toString());

        // Print comparison results
        System.out.println("Comparing " + str1 + " and " + sb1.toString() + ": " + comparison1);
        System.out.println("Comparing " + str2 + " and " + sb2.toString() + ": " + comparison2);
    }
}


/*7.	Write a Java program to check whether two String objects contain the same data.
Sample Output:
"Stephen Edwin King" equals "Walter Winchell"? false                                                          
"Stephen Edwin King" equals "Mike Royko"? false*/

class check_String_object_equality
{
    public static void main(String[] args) {
        String s1=new String("My name is priyanshi Sharma");
        String s2=new String("My name is priyanshi");
        int count=0;
        if(s1.length()!=s2.length())
        {
            System.out.println("not same");
        }
        else{
            for(int i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)==s2.charAt(i))
                {
                    count++;
                }
            }
            if(count==s1.length()&&count==s2.length())
            {
                System.out.println("same");
            }
            else
            {
                System.out.println("not same");
            }
        }
        
    

    }
}




