package MySocket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class SocketClient {
	
	public static void main(String[] zero) {
		
		//InetAddress a;
		Socket socket;
		//BufferedReader in;
		//PrintWriter out;
		
		try {
		//System.out.println(InetAddress.getLocalHost());
			System.out.println("Demande de connexion");
			//InetAddress a=InetAddress.getLocalHost();
			socket = new Socket("192.168.43.65",3000);	
			System.out.println(socket.getInetAddress().getHostAddress());
			
		       System.out.println("Demande de connexion");

		    /*    in = new BufferedReader (new InputStreamReader (socket.getInputStream()));
		        String message_distant = in.readLine();
		        System.out.println(message_distant);
		        */		    //   socket.close();
		       
		}catch (UnknownHostException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}

