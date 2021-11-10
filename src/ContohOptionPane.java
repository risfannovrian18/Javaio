import javax.swing.*;
public class ContohOptionPane {
	public static void main(String[] args) {
		JFrame kotak=new JFrame();
		String name = JOptionPane.showInputDialog(kotak,"Masukkan Nama Anda");
		JOptionPane.showMessageDialog(kotak,"Selamat Datang, "+name);
	}
}

