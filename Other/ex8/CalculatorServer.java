package ex8;

// CalculatorServer.java
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorServer {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.security.policy", "calculator.policy");

        CalculatorImpl calculator = new CalculatorImpl();
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.rebind("CalculatorService", calculator);
        System.out.println("Server is running...");
    }
}

