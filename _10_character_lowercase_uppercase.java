/*10.	Write a Java program to convert all characters in a string to lowercase.
Sample Output:
Original String: The Quick BroWn FoX!                                                                         
string in lowercase: the quick brown fox!
11.	 Write a Java program to convert all characters in a string to uppercase.
Sample Output:*/



public class _10_character_lowercase_uppercase {
    public static void main(String[] args) {
        String s="This is a Example of String";
        String lowercase=s.toLowerCase();
        System.out.println("String in lowercase "+lowercase);
        String uppercase=s.toUpperCase();
        System.out.println("String in uppercase "+uppercase);
        
    }
    
}

