import javax.swing.*;
public class input {
    JFrame f;
    input(){
        f = new JFrame();
        JOptionPane.showInputDialog(f,"enter name");
    }

    public static void main(String[] args){
        new input();
    }
}
