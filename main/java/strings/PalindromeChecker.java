package strings;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome(args[0]));

    }

    public static boolean isPalindrome (String potentialPalindrome){
        if(isSingular(potentialPalindrome)){
             return true;
        }
        else if(isFirstLastIndexSame(potentialPalindrome)){
            return isPalindrome(getSubstring(potentialPalindrome));
        }
        return false;
        }

    public static boolean isSingular(String potentialPalindrome) {
        return potentialPalindrome.isEmpty() || (potentialPalindrome.length()==1);
    }

    public static String getSubstring(String toBeChecked) {
        return toBeChecked.substring(1,toBeChecked.length()-1);
    }

    public static boolean isFirstLastIndexSame(String toBeChecked) {
        return toBeChecked.charAt(0)==toBeChecked.charAt(toBeChecked.length()-1);
    }
}