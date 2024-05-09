package ex8;

// CalculatorClient.java
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) throws Exception {
        
        System.setProperty("java.security.policy", "calculator.policy");

        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        Calculator calculator = (Calculator) registry.lookup("CalculatorService");
        int result = calculator.add(5, 30);
        System.out.println("Result: " + result);
    }
}

