public class _13_character_count {
    public static void main(String[] args)
     {
        String s="java123";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a'&& s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z')
            {
                count++;
            }
        }
        System.out.println(count);
        
    }
    
}
