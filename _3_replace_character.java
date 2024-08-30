//replace character in string

public class _3_replace_character {
    public static void main(String[] args) {
        String s1="banana";
        String s2="";
          for(int i=0;i<s1.length();i++)
          {
             char c=s1.charAt(i);
            if(c=='a')

            {
                c='o';
                
                s2+=c;
            }
            else{
                s2+=s1.charAt(i);
            }
            
        }
        System.out.println("original String  "+s1);
        System.out.println("modified String "+s2);
        
        }
    }



    //by using method

    class replace
    {
        public static void main(String[] args) {
            String s1="banana";
            String s2=s1.replace('a','o');
            System.out.println(s2);
        }
    }
    

