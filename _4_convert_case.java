
//convert uppercase

public class _4_convert_case {
    public static void main(String[] args) { 
    String s1="hello world";
    
    String s2="";
    for(int i=0;i<s1.length();i++)
    {
        char ch=s1.charAt(i);
        if(ch>='a'&&ch<='z')
        {
            ch=(char)(ch+32);   //put all the character in upper case
        }


       s2+=ch; 


    }
    System.out.println(s2);
    
    }  
}




 class _4_convert_case_lower {
    public static void main(String[] args) { 
    String s1="HELLO WORLD";
    
    String s2="";
    for(int i=0;i<s1.length();i++)
    {
        char ch=s1.charAt(i);
        if(ch>='A'&&ch<='Z')
        {
            ch=(char)(ch+32); //put all the character in lower caseh   
        }


       s2+=ch; 


    }
    System.out.println(s2);
    
    }  
}
