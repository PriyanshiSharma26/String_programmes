/*8.	Write a Java program to replace a specified character with another character.
Sample Output:
Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown fox jumps over the lazy fog.*/



//by using method
public class _9_replace_character {
    public static void main(String[] args) {
        String s1="this is a cat";
        System.out.println(s1.replace('c','b'));

    }
}
  
//without using replace method

class replace_character{
    public static void main(String[] args) 
    {
      String str="Hill house"  ;
      System.out.println("original string: "+str);
      int pos=0;
      char replace='w';
      int index=0;
      String result=str.substring(0,index)+replace+str.substring(index+1);
      System.out.println("change character string: "+result);
    }
}