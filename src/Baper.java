import java.io.*;
public class Baper {
	public static void main(String args[]) throws Exception{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		System.out.println("Masukkan Nama Anda");
		String name=br.readLine();
		System.out.println("Selamat Datang, "+name);
	}
}