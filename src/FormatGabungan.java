import java.util.Date;
import javax.swing.*;
class FormatGabungan{
	public static void main(String args[])
	{
		String teks = "Jumlah Mahasiswa :";
		int jml = 20;
		Date tgl = new Date();
		//System.out.printf("Tampilkan %S per %td %<tB %<tY %<tH:%<tM:%<tS WIB : %d ", teks,tgl,jml);
		String str;
		str = String.format("TEST : %td %<tB %<tY %<tH:%<tM:%<tS WIB",tgl);
		JFrame kotak=new JFrame();
		String name = JOptionPane.showInputDialog(kotak,str);
		JOptionPane.showMessageDialog(kotak,"Selamat Datang, "+name);
	}
}