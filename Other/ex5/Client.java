package ex5;

import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            Palindrome palindrome = (Palindrome) Naming.lookup("rmi://localhost:1099/PalindromeService"); // Type Casting
            System.out.println(palindrome.isPalindrome("radarzzz"));  // true
            System.out.println(palindrome.isPalindrome("12321"));  // true
            System.out.println(palindrome.isPalindrome("hello"));  // false
        } catch (Exception e) {
            System.out.println("Client failed: " + e);
        }
    }
}
