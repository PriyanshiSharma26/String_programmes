//Replace all the ocurrence of "string" in a string  with "java".

public class _2_replace_word {
    public static void main(String[] args)
    {
        String msg="it is a example of String";
        String arr[]=msg.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equalsIgnoreCase("string"))
            {
                arr[i]="java_String";
            }
        }
        String newstring=" ";
        for(int i=0;i<arr.length;i++)
        {
            newstring+=arr[i]+" ";
        }
    
        System.out.println(newstring);
        
    }
    
}
