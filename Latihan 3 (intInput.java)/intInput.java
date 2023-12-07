import javax.swing.*;
    public class intInput{
        public static void main(String[] args) {

        int angka;
        String rubah = JOptionPane.showInputDialog("MasukanJumlah angka = ");

        //String diubah ke Integer  
        
        angka = Integer.parseInt(rubah);
        String info = "Anda memasukan angka " + angka ;  
        JOptionPane.showMessageDialog(null, info);  
        JOptionPane.showConfirmDialog(null,"terima kasih","keluar",JOptionPane.CLOSED_OPTION);
    }
}