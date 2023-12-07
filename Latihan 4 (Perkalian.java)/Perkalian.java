import javax.swing.*;
    public class Perkalian {
        public static void main(String[] args) {
        String strA = JOptionPane.showInputDialog("Enter bilangan:");  
        int A = Integer.parseInt( strA );
        String strB = JOptionPane.showInputDialog("Enter bilangan: ");
        int B = Integer.parseInt( strB );
        JOptionPane.showMessageDialog(null,"Hasil Perkalian Adalah \n : " + A + " * " + B + " = " + (A*B));
    }
}