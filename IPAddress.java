package august;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {

	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress ipAddress;
		ipAddress = InetAddress.getLocalHost();
		System.out.println("My IP Address : " + ipAddress); 

	}

}
