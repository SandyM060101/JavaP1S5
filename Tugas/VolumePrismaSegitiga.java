import javax.swing.*;

public class VolumePrismaSegitiga {
    public static void main(String args[]) {
        // Meminta pengguna untuk memasukkan panjang alas segitiga
        String strAlas = JOptionPane.showInputDialog("Masukkan Panjang Alas Segitiga: ");
        double alas = Double.parseDouble(strAlas);

        // Meminta pengguna untuk memasukkan tinggi segitiga
        String strTinggi = JOptionPane.showInputDialog("Masukkan Tinggi Segitiga: ");
        double tinggi = Double.parseDouble(strTinggi);

        // Meminta pengguna untuk memasukkan tinggi prisma
        String strTinggiPrisma = JOptionPane.showInputDialog("Masukkan Tinggi Prisma: ");
        double tinggiPrisma = Double.parseDouble(strTinggiPrisma);

        // Menghitung volume prisma segitiga
        double volume = 0.5 * alas * tinggi * tinggiPrisma;

        // Menampilkan hasil
        JOptionPane.showMessageDialog(null, "Volume Prisma Segitiga adalah: \n = 0.5 * " + alas + " * " + tinggi + " * " + tinggiPrisma + "\n = " + volume);
        JOptionPane.showConfirmDialog(null,"terima kasih","eluar",JOptionPane.CLOSED_OPTION);
    }
}
