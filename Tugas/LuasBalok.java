import javax.swing.*;

public class LuasBalok {
    public static void main(String args[]) {
        // Rumus Luas Balok: L = 2 * (pl + lt + pt)

        // Masukkan Panjang Balok
        String strP = JOptionPane.showInputDialog("Masukkan Panjang Balok: ");
        int panjang = Integer.parseInt(strP);

        // Masukkan Tinggi Balok
        String strT = JOptionPane.showInputDialog("Masukkan Tinggi Balok: ");
        int tinggi = Integer.parseInt(strT);

        // Masukkan Lebar Balok
        String strL = JOptionPane.showInputDialog("Masukkan Lebar Balok: ");
        int lebar = Integer.parseInt(strL);

        // Hitung Luas Permukaan Balok
        int luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

        // Tampilkan Hasil
        JOptionPane.showMessageDialog(null, "Luas balok adalah: \n" + "= (" + panjang + " * " + lebar + ") + " + "(" + panjang + " * " + tinggi + ") + " + "(" + lebar + " * " + tinggi + ")\n= " + luas);
        JOptionPane.showConfirmDialog(null,"terima kasih","keluar",JOptionPane.CLOSED_OPTION);
    }
}
