package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class GCD {
    public static void runGCD() {

        Random random = new Random();
        var dataGame = new String[ROUNDS][];
        final int limit = 50;

        for (var i = 0; i < ROUNDS; i++) {

            int number1 = random.nextInt(1, limit);
            int number2 = random.nextInt(1, limit);

            var correctAnswer = calculateGCD(number1, number2);

            dataGame[i] = new String[]{number1 + " " + number2, String.valueOf(correctAnswer)};
        }
        Engine.run(dataGame, "Find the greatest common divisor of given numbers.");
    }

    public static int calculateGCD(int number1, int number2) {
        while (number1 != 0 && number2 != 0) {
            if (number1 > number2) {
                number1 = number1 % number2;
            } else {
                number2 = number2 % number1;
            }
        }
        return number1 + number2;
    }
}
