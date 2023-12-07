import javax.swing.*;

public class VolumeLimas {
    public static void main(String args[]) {
        //masukkan panjang alas limas
        String strAlas = JOptionPane.showInputDialog("Masukkan Panjang Alas Limas: ");
        double alas = Double.parseDouble(strAlas);

        //masukkan lebar alas limas
        String strLebar = JOptionPane.showInputDialog("Masukkan Lebar Alas Limas: ");
        double lebar = Double.parseDouble(strLebar);

        //masukkan tinggi limas
        String strTinggiLimas = JOptionPane.showInputDialog("Masukkan Tinggi Limas: ");
        double tinggiLimas = Double.parseDouble(strTinggiLimas);

        // Menghitung volume limas
        double volume = (1.0 / 3.0) * alas * lebar * tinggiLimas;

        // Menampilkan hasil
        JOptionPane.showMessageDialog(null, "Volume Limas adalah: \n = (1/3) * " + alas + " * " + lebar + " * " + tinggiLimas + "\n = " + volume);
        JOptionPane.showConfirmDialog(null,"terima kasih","keluar",JOptionPane.CLOSED_OPTION);
    }
}
