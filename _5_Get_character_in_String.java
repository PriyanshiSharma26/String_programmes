//1.	Write a Java program to get the character at the given index within the string.

import java.util.Scanner;
     
public class _5_Get_character_in_String{
      public static void main(String[] args) 
        {
           System.out.println("enter the String");
           Scanner sc=new Scanner(System.in);
           String str=sc.nextLine();
           System.out.println("enter the index position");
           int index=sc.nextInt(); 
           char character=str.charAt(index);
           System.out.println("character at "+index +"index position "+character);
           sc.close();
        }
        
    }
    
    
