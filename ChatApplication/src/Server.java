import java.net.*;
import java.io.*;
public class Server {
	ServerSocket server;
	Socket socket;
	
	BufferedReader br;
	PrintWriter out;
	
	Server()
	{
		try
		{
			server=new ServerSocket(8888);
			System.out.println("Server is waiting to accept connection");
			System.out.println("waiting.......");
			socket =server.accept();
			
			br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out=new PrintWriter(socket.getOutputStream());
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			
		}
		
	}
	public static void main(String[] args) {
		
	 System.out.println("this is server......going to start server.");
	 
	 

	}

}
