package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void runCalc() {

        var ROUNDS = 3;
        Random random = new Random();
        var dataGame = new String[ROUNDS][];
        final int limit1 = 10;
        final int limit2 = 3;
        for (var i = 0; i < ROUNDS; i++) {
            int number1 = random.nextInt(1, limit1);
            int number2 = random.nextInt(1, limit1);
            String[] signs = {"-", "+", "*"};
            int sign = random.nextInt(0, limit2);
            var correctAnswer = calculate(number1, number2, signs[sign]);

            dataGame[i] = new String[] {number1 + " " + signs[sign] + " "
                        + number2, String.valueOf(correctAnswer)};
        }
        Engine.run(dataGame, "What is the result of the expression?");
    }

    public static int calculate(int number1, int number2, String symbol) {
        return switch (symbol) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> throw new RuntimeException("unknown operation");
        };
    }
}
