package whilelooptasks;

import javax.swing.JOptionPane;


public class Task3 {
    public static void main(String[] args) {
        int count = 0;
        int highest = -1;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
      
        while (num >= 0){
           count++;
           if (num > highest){
               highest = num;
           }
          num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        }
        System.out.println("Number of numbers entered is " + count);
        System.out.println("Highest Number entered is " + highest);
    }
}
