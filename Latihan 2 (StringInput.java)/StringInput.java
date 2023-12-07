import javax.swing.*;

public class StringInput{
    public static void main(String args[]){
        String nama = JOptionPane.showInputDialog("Siapa Nama Anda? ");
        JOptionPane.showMessageDialog(null, nama);
        JOptionPane.showConfirmDialog(null, "Terima Kasih","Keluar",JOptionPane.CLOSED_OPTION);
    }
}