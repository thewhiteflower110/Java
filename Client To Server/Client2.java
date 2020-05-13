//client.java


	import java.net.*;
	import java.io.*;
public class Client2
{
	public static void main(String[] args)
	{
		try{
		Socket s= new Socket("localhost",8080);
		DataOutputStream dout= new DataOutputStream(s.getOutputStream());
		dout.writeUTF("hello server!!");
		dout.flush();
		dout.close();
		s.close();
		}
		catch(Exception e){System.out.println(e);}
	}
}
