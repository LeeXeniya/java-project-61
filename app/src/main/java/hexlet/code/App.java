package hexlet.code;

import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int userNumber = scanner.nextInt();
        scanner.nextLine();

        switch (userNumber) {
            case 1 -> Cli.getName();
            case 2 -> Even.getEven();
            case 3 -> Calc.getCalc();
            case 4 -> GCD.getGCD();
            case 5 -> Progression.getProgression();
            case 6 -> Prime.getPrime();
	        default -> {break;}
        }
        scanner.close();
    }
}
