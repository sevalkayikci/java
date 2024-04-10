import javax.swing.JOptionPane;
public class name {
    public static void main(String[] args){
        String firstName;
        String middleName;
        String Surname;

        firstName = JOptionPane.showInputDialog("enter first name");
        middleName = JOptionPane.showInputDialog("enter middle name");
        Surname = JOptionPane.showInputDialog("enter surname");

        JOptionPane.showMessageDialog(null, "hello" + " " + firstName + " " + middleName);

    }

}


