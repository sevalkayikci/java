import javax.swing.*;
public class JoptionExample {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog(null, "enter your name");
        JOptionPane.showMessageDialog(null, "welcome," + name);

    }
}
