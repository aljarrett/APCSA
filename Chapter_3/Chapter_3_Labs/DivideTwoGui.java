import javax.swing.*;

public class DivideTwoGui
{
    public static void main(String[] args)
    {
      String input;
      JOptionPane.showMessageDialog(null, "This program divides two numbers.");
      input = JOptionPane.showInputDialog("Enter the numerator:");
      int numerator = Integer.parseInt(input);
      input = JOptionPane.showInputDialog("Enter the denominator:");
      int denominator = Integer.parseInt(input);
      JOptionPane.showMessageDialog(null, numerator + "/" + denominator + " = " +
                                    (double) numerator/denominator);
      System.exit(0);
    }
}