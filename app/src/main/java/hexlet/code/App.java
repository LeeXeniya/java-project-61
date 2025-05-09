package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
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
            case 0:
                break;
        }
      //  }
        scanner.close();
    }
}
