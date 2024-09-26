package whilelooptasks;

public class Task1 {

    public static void main(String[] args) {
        int count = 0;
        int num = 0;
        while (num != 27) { // condition must become false for the loop to end
            count++;
            num = (int) (Math.random() * 100 + 1);
            System.out.println(num);
        }
        System.out.println(count + " numbers were generated");

    }
}
