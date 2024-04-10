import javax.swing.*;
import java.awt.event.*;
public class confirm extends WindowAdapter{
    JFrame f;
    confirm(){
        f = new JFrame();
        f.addWindowListener(this);
        f.setSize(300,300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int a = JOptionPane.showConfirmDialog(f, " are you sure?");

        if (a == JOptionPane.YES_OPTION){
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    public static void main(String[] args){
        new confirm();
    }
}
