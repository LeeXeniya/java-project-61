package hexlet.code;

import hexlet.code.games.*;
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
            case 1:
                Cli.getName();
                break;
            case 2:
                Even.getEven();
                break;
            case 3:
                Calc.getCalc();
                break;
            case 4:
                GCD.getGCD();
                break;
            case 5:
                Progression.getProgression();
                break;
            case 6:
                Prime.getPrime();
                break;
            case 0:
                break;
        }
      //  }
        scanner.close();
    }
}
