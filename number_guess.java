import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class number_guess {
    private JTextField textField;
    private JPanel panel1;
    private JButton checkButton;
    private JLabel show;

    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
//        System.out.println("Random Number: " + randomNumber);

        int count = 0;
        while(true)
        {
            System.out.println("Enter your guess (1-100):");
            int playGuess = scanner.nextInt();
            count++;

            if(playGuess == randomNumber)
            {
                System.out.println("Wooohh! You win.");
                System.out.println("It took you " + count + " tries.");
                break;
            }
            else if(randomNumber > playGuess)
            {
                System.out.println("Nope! The number is higher. Guess again.");
            }
            else
            {
                System.out.println("Nope! The number is lower. Guess again.");
            }
        }

    }
}
