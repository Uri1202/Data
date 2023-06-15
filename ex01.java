import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        rollDice();
    }

    public static void rollDice() {
        System.out.println("Rolling dice...");
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int totalValue = die1 + die2;

        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + (die1 + die2));

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        if (totalValue > 7) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost.");
        }
    }
}
