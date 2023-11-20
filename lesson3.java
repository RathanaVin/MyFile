
import javax.swing.*;

public class lesson3 {
    public static void main(String[] args){
        JFrame How = new JFrame("User Input Dialog Box 1");
        int score1 ,score2, total;
        score1 = Integer.parseInt(JOptionPane.showInputDialog(How,"Input score1 :"));
        score2 = Integer.parseInt(JOptionPane.showInputDialog(How,"Input score2 :"));
        total = score1 + score2;

        JOptionPane.showMessageDialog(null,"Total : "+score1+" + "+score2+" = " + total);
    }
}