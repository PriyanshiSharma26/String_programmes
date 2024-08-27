public class _4_Check_String_balance {
    public static void main(String[] args) {
        String str="((((()))))";
        int opening=0;
        int closing=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
               opening++;
            }
            else if(str.charAt(i)==')')
            {
                closing++;
            }
        }
            if(opening==closing)
            {
                System.out.println("String is Balanced");
            }
            else{
                System.out.println("not balanced");
            }
        }
    }
    

