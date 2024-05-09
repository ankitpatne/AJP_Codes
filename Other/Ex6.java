import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex6 {
    public static void main(String[] args) {
        try {
            // Use the getLocalHost method to get the InetAddress of the local host
            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local Host: " + localAddress);

            // Use the getByName method to get the InetAddress of a specific host
            InetAddress googleAddress = InetAddress.getByName("www.google.com");
            System.out.println("Google: " + googleAddress);

            // Use the getAllByName method to get all InetAddresses of a specific host
            InetAddress[] allGoogleAddresses = InetAddress.getAllByName("www.amazon.us");
            System.out.println("All Google Addresses: ");
            for (InetAddress address : allGoogleAddresses) {
                System.out.println(address);
                System.out.println("Host Name: " + address.getHostName());
                System.out.println("Host Address: " + address.getHostAddress());
                System.out.println("Canonical Host Name: " + address.getCanonicalHostName());
            }
        } catch (UnknownHostException e) {
            System.out.println("Host not found: " + e.getMessage());
        }
    }
}
