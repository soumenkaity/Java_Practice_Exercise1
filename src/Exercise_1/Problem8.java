package Exercise_1;

import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int original = (int) (Math.random() * 100) + 1;
        while (true) {
            System.out.println("Guess a number between 1 to 100");
            int guessed = sc.nextInt();
            if (original == guessed) {
                System.out.println("well done!\n suceess !\nNumber guessed matches the original number");
                break;
            } else if (original < guessed) {
                System.out.println("Number guessed is more than original number");

            } else {
                System.out.println("Number guessed is less than original number");
            }
        }

    }
}
