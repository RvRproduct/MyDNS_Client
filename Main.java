
import java.io.IOException;

public class Main 
{
    public static void main(String[] args) 
    {
        try
        {
            DNSClient.RunDNSClient();
        }
        catch (IOException e)
        {
            System.err.println("An error occurred while running the DNS client: " + e.getMessage());
        }
    }
}
