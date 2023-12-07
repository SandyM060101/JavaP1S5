import javax.swing.*;

public class LuasSegitiga {
    public static void main(String args[]) {
        // Meminta pengguna untuk memasukkan alas segitiga
        String strAlas = JOptionPane.showInputDialog("Masukkan Alas Segitiga: ");
        double alas = Double.parseDouble(strAlas);

        // Meminta pengguna untuk memasukkan tinggi segitiga
        String strTinggi = JOptionPane.showInputDialog("Masukkan Tinggi Segitiga: ");
        double tinggi = Double.parseDouble(strTinggi);

        // Menghitung luas segitiga
        double luas = 0.5 * alas * tinggi;

        // Menampilkan hasil
        JOptionPane.showMessageDialog(null, "Luas Segitiga adalah: \n = 0.5 * " + alas + " * " + tinggi + "\n = " + luas);
        JOptionPane.showConfirmDialog(null,"terima kasih","keluar",JOptionPane.CLOSED_OPTION);
    }
}
