//count of words in a string

class _1_count_words
{
    public static void main(String[] args) {
        String msg="this  is a string .Strng is the topic in java";

               System.out.println("The given String is: " + msg);
               // initial count of the words
               int total = 1;
               // for loop to count the number of words
               for (int i = 0; i < msg.length(); i++) {
                  // checking if current character is space or not
                  if ((msg.charAt(i) == ' ') && (msg.charAt(i + 1) != ' ')) {
                     total++; // incrementing the word count 
                  }
               }
               // printing the result
               System.out.println("Number of words in the given string: " +  total);
            }
         } 
    
    

