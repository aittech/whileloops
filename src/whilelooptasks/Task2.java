
package whilelooptasks;

import javax.swing.JOptionPane;


public class Task2 {
    public static void main(String[] args) {
        double totalsales = 0;
        int count = 0;
        String item = JOptionPane.showInputDialog("Enter name of item"); 
        
        while(!item.equalsIgnoreCase("STOP")){ 
            double price = Double.parseDouble(JOptionPane.showInputDialog("Enter item price"));
            count++;
            totalsales += price;
            item = JOptionPane.showInputDialog("Enter name of item");
        }
        
        System.out.println("Total Sales " + totalsales);
        System.out.println("Number of items " + count);
    }
}

