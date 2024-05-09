package ex5;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PalindromeImpl extends UnicastRemoteObject implements Palindrome {
    protected PalindromeImpl() throws RemoteException {
        super();
    }

    @Override
    public boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}