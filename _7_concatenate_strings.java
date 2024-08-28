/*4.	 Write a Java program to concatenate a given string to the end of another string.
String 1: PHP Exercises and                                                                                   
String 2: Python Exercises                                                                                    
The concatenated string: PHP Exercises and Python Exercises*/

public class _7_concatenate_strings {
    public static void main(String[] args)
     {
        String str="priyanshi";
        String str2="Sharma";
        String concat1=str+ "  " +str2;
        String concat2=str.concat(str2);
        System.out.println(concat1);
        System.out.println(concat2);
        
    }
    
}
