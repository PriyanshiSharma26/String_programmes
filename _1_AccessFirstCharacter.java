//Access first character and last character of String

class AccessFirstCharacter
{
    public static void main(String[] args) {
     String str="java";
     if(str!=null&& !str.isEmpty())
     {
       char firstchar=str.charAt(0);
       char lastchar=str.charAt(str.length()-1);
       System.out.println("first character is: "+firstchar);
       System.out.println("last character of String "+lastchar);
     }
     else{
        System.out.println("String is empty");
     }
        
    }
}