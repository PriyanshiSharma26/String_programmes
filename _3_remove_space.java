//remove white_space from String

public class _3_remove_space {
    public static void main(String[] args) {
        String str="this is a string";
        String newstr="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
               newstr+=str.charAt(i);  
            }
        }
        str=newstr;
        System.out.println(str);
    }
    
}
