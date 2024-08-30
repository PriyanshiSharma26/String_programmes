 import java.util.*;
 class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string you want to reverse : ");
        String str_original=sc.nextLine();
        
        String str_new = "";

        // Split the original string by spaces
        String[] arr = str_original.split(" ");
        
        // Check if there's only one word
        if (arr.length == 1) {
            // Reverse the single word
            String word = arr[0];
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            str_new = reversedWord;
        } else {
            // Reverse the order of words
            for (int i = arr.length - 1; i >= 0; i--) {
                str_new += arr[i] + " ";
            }
        }

        System.out.println(str_new.trim()); // trim to remove the trailing space
    }
}
