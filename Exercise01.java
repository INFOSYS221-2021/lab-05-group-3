public class ExerciseOne {
    public static void main(String args[]) {
      ExerciseOne ex01 = new ExerciseOne();

      //System.out.println(ex01.reverseString("hello world"));
      //System.out.println(ex01.reverseString("racecar"));
      //System.out.println(ex01.isStringPalindrome("racecar"));
      
      //Uncomment the following statements after finishing Exercise Four
    System.out.println(ex01.isStringPalindrome("hello world"));
    System.out.println(ex01.isStringPalindrome("Dad Dad"));
    System.out.println(ex01.isStringPalindrome("radar"));
    }
    
    // Exercise One
    private String reverseString(String word) {
        String revWord = "";
            for (int i = 0; i < word.length(); i++) {
                revWord = word.charAt(i) + revWord;
            }
        // Complete this method to return the reveresed order of the given word
        return revWord;
    }
    
    // Exercise Four
    private boolean isStringPalindrome(String word) {
        // Complete this method to deermine if the given word is a palindrome
        return (word.toLowerCase()).equals(reverseString(word.toLowerCase()));
    }
}
