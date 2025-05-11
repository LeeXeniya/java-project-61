package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class Calc {
    public static void getCalc() {

        Random random = new Random();
        var questions = new String[ROUNDS][];
        final int limit = 10;
        final int limit1 = 3;
        for (var i = 0; i < ROUNDS; i++) {
            int number1 = random.nextInt(1, limit);
            int number2 = random.nextInt(1, limit);
            String[] signs = {"-", "+", "*"};
            int sign = random.nextInt(0, limit1);
            var correctAnswer = calculate(number1, number2, signs[sign]);

            questions[i] = new String[] {number1 + " " + signs[sign] + " "
                        + number2, String.valueOf(correctAnswer)};
        }
        Engine.run(questions, "What is the result of the expression?");
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
