

class CharRepeatMax {
    public static void main(String[] args) {
        String a = "i love java ,i also love python but i dont like kotlin ";
        int maxCount = 0;
        String maxChars = ""; // To store characters with the maximum count

        // Iterate through each character in the string
        for (int i = 0; i < a.length(); i++) 
        {
            char currentChar = a.charAt(i);
            if (currentChar == ' ') 
            {
                continue; // Skip spaces
            }

            int count = 0;

            // Count occurrences of currentChar
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Update maxCount and maxChars if the current character's count is higher
            if (count > maxCount) {
                maxCount = count;
                maxChars = Character.toString(currentChar);
            } else if (count == maxCount && maxChars.indexOf(currentChar) == -1) {
                maxChars += currentChar ;
          }  
            
        }

        System.out.println("Characters with max occurrence: " + maxChars + " (Occurrences: " + maxCount + ")");
    }
}

