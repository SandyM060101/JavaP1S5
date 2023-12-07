import javax.swing.*;

public class LuasLingkaran {
    public static void main(String args[]) {
        double pi = 3.14;

        // masukkan Jari-Jari Lingkaran
        String strR = JOptionPane.showInputDialog("Masukkan Jari-Jari : ");
        double R = Double.parseDouble(strR);

        // Menghitung Luas Lingkaran
        double luas = pi * R * R;

        // Menampilkan Hasil
        JOptionPane.showMessageDialog(null, "Luas Lingkaran adalah : \n = " + pi + " * " + R + " * " + R + "\n = " + luas);
        JOptionPane.showConfirmDialog(null,"terima kasih","keluar",JOptionPane.CLOSED_OPTION);
    }
}
