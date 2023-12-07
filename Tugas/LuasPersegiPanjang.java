import javax.swing.*;
public class LuasPersegiPanjang{
    public static void main(String args[]){
        // masukkan panjang persegi panjang
        String strP = JOptionPane.showInputDialog("Masukan Panjang Persegi Panjang : ");
        int P = Integer.parseInt(strP);

        // masukkan lebar persegi panjang
        String strL = JOptionPane.showInputDialog("Masukan Lebar Persegi Panjang : ");
        int L = Integer.parseInt(strL);

        // Menghitung luas persegi panjang dan Menampilkan Hasil
        JOptionPane.showMessageDialog(null,"Luas Persegi Panjang Adalah : \n = " + P + "*" + L + "\n = " + (P*L));
        JOptionPane.showConfirmDialog(null,"terima kasih","keluar",JOptionPane.CLOSED_OPTION);
    }
}