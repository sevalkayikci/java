import javax.swing.*;
public class alert {
    JFrame f;
    alert(){;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
    }
    public static void main(String[] args){
        new alert();
    }
}
