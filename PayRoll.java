import javax.swing.JOptionPane;
public class PayRoll {
    public static void main(String[] args){
        String inputString; //for reading input
        String name; // user name
        int hours; //no of hours worked
        double payRate; //users hourly pay rate
        double grossPay; //users gross pay

        name = JOptionPane.showInputDialog(null, "What's your name ?");

        inputString = JOptionPane.showInputDialog(null,"How many hours did you worked this week?");

        hours = Integer.parseInt(inputString);

        inputString = JOptionPane.showInputDialog(null,"what is your hourly pay rate?");

        payRate = Double.parseDouble(inputString);

        grossPay = hours * payRate;

        JOptionPane.showMessageDialog(null,"hello,"+name+". Your gross pay is $" + grossPay);

        System.exit(0);

    }
}
