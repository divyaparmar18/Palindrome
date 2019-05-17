package strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    @Test public void emptyStringShouldBeAPalindrome() {
        assertTrue("Expected empty string to be a palindrome", PalindromeChecker.isPalindrome(""));
    }

    @Test public void singularStringShouldBeAPalindrome() {
        assertTrue("Expected singular string to be a palindrome", PalindromeChecker.isPalindrome("A"));

    }
    @Test public void stringHavingFirstAndLastIndexSameShouldBeAPalindrome() {
        assertTrue("Expected string with last and first index to be similar is a palindrome", PalindromeChecker.isPalindrome("AA"));
    }
    @Test public void stringNotHavingFirstAndLastIndexNotSameShouldNotBePalindrome() {
        assertFalse("Expected a string with different last and first index to not be a palindrome", PalindromeChecker.isPalindrome("Ayu"));
    }
    @Test public void stringShouldBeEqualToItselfViseVersa() {
        assertTrue("Expected string to be similar as viseversa to be a palindrome", PalindromeChecker.isPalindrome("NitiN"));
    }

    @Test public void stringShouldNotBeEqualToItselfViseVersa() {
        assertFalse("Expected string to be not similar as viseversa to not be a palindrome", PalindromeChecker.isPalindrome("Zoyaa"));
    }
}

