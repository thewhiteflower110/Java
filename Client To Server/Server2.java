
//server.java
//switch on server first!!
	import java.net.*;
	import java.io.*;
public class Server2
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket ss = new ServerSocket(8080);
			Socket s= ss.accept();
			DataInputStream din= new DataInputStream(s.getInputStream());
			String str=(String)din.readUTF();
			System.out.println(""+str);
			ss.close();
		}
		catch(Exception e)
		{System.out.println(""+e);}
	}
}