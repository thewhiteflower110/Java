import java.util.Scanner;
import java.security.*;
public class digitalSignature
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Text");
	String msg= sc.nextline();
	KeypairGenerator keypairgen= KeypairGenerator.getInstance("DSA");
	keypairgen.initialize(20148);
	keyPair pair=keypairgen.generatekeyPair();
	Privatekey prvtkey = pair.getPrivate();
	Sign.initSign(prvtkey);
	byte[] bytes = new byte();
	bytes="msg".getBytes();
	Sign.update(bytes);
	byte[].signature=Sign.sign();
	System.out.println("DS for given Text"+ new String(signature,"UTF8"));
	}
}