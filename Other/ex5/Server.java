package ex5;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            PalindromeImpl palindrome = new PalindromeImpl();
            Naming.rebind("rmi://localhost:1099/PalindromeService", palindrome);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println("Server failed: " + e);
        }
    }
}
