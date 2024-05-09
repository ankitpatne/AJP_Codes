import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            // Get InetAddress for the local host
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host:");
            System.out.println("Host Name: " + localHost.getHostName());
            System.out.println("IP Address: " + localHost.getHostAddress());

            // Get InetAddress for a specified host name
            String hostName = "www.example.com";
            InetAddress inetAddress = InetAddress.getByName(hostName);
            System.out.println("\nHost: " + hostName);
            System.out.println("Host Name: " + inetAddress.getHostName());
            System.out.println("IP Address: " + inetAddress.getHostAddress());

            // Check if the InetAddress is reachable
            System.out.println("\nIs Reachable: " + inetAddress.isReachable(5000));
        } catch (UnknownHostException e) {
            System.out.println("Unknown host or IP address: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
