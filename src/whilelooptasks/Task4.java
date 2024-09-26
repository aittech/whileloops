package whilelooptasks;

import javax.swing.JOptionPane;


public class Task4 {

 
    public static void main(String[] args) {
        int sum = 0;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        System.out.print(num);
        while (num!= sum){
            sum += num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            System.out.print("," + num);   
        }
    }

}


