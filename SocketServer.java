package MySocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	
	public static void main(String[] zero) {
		
		ServerSocket socketserver  ;
		Socket socketduserveur ;
		//BufferedReader in;
		//PrintWriter out;
		
		try {
		
			socketserver = new ServerSocket(3000);
			System.out.println("Le serveur est à l'écoute du port "+socketserver.getLocalPort() +"  "+ socketserver.getInetAddress());
			socketduserveur = socketserver.accept(); 
		        System.out.println("Un zéro s'est connecté");
			//out = new PrintWriter(socketduserveur.getOutputStream());
		      //  out.println("Vous êtes connecté zéro !");
		        //out.flush();
		                
		        
		        BufferedReader br=new BufferedReader(new InputStreamReader(socketduserveur.getInputStream()));
		        
		        System.out.println(br.readLine());

		        br.close();
		        socketduserveur.close();
		        socketserver.close();
		        
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
