 class LongestWordFinder {

    public static void main(String[] args) {
        String input = "Find the longest word in this sentence abcdfyrgdjckchcbcjjdxn"; // Change this to test other strings
        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ') {
                currentWord += c;
            } else {
                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
                currentWord = "";
            }
        }
        // Check the last word
        if (currentWord.length() > longestWord.length()) {
            longestWord = currentWord;
        }

        System.out.println("Longest word: " + longestWord);
    }
}
