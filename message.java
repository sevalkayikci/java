import javax.swing.*;
public class message {
    JFrame f;
    message(){;
    f = new JFrame();
    JOptionPane.showMessageDialog(f,"hello world");
    }
    public static void main(String[] args){
        new message();
    }
}

