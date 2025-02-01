import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class DNSClient 
{
    public static void RunDNSClient() throws IOException
    {
        int serverPort = 5678;
        InetAddress serverHost = InetAddress.getByName("localhost");
        System.out.println("Sending to " + serverHost + " " +serverPort);
        DatagramSocket socket = new DatagramSocket();

        System.out.println("I am " + socket.getLocalPort());

        byte[] data = new byte[3];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        DatagramPacket pkt = new DatagramPacket(data, data.length, serverHost, serverPort);
        socket.send(pkt);
    }
}
