class SpaceAndWordCounter
 {

    public static void main(String[] args) {
        // Hardcoded string
        String input = "This is a sample string to count spaces and words.";

        int spaceCount = 0;
        int wordCount = 0;
        boolean inWord = false;

        // To count spaces and words
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Count spaces
            if (c == ' ') {
                spaceCount++;
                inWord = false; // We are not in a word anymore
            } else {
                // Count words
                if (!inWord) {
                    wordCount++;
                    inWord = true; // We are now in a word
                }
            }
        }

        // To remove spaces from the string
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ') {
                output += c; // Append characters that are not spaces
            }
        }

        // Output results
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of spaces: " + spaceCount);
        System.out.println("String without spaces: \"" + output + "\"");
    }
}

