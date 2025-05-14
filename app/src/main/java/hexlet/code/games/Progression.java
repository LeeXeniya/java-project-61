package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class Progression {
    public static void runProgression() {

        Random random = new Random();
        var dataGame = new String[ROUNDS][];
        final int limit1 = 100;
        final int limit2 = 10;
        final int startLimit = 5;

        for (var i = 0; i < ROUNDS; i++) {
            int number1 = random.nextInt(1, limit1);
            int quantity = random.nextInt(startLimit, limit2);
            int point = random.nextInt(0, quantity - 1);
            int difference = random.nextInt(2, limit2);

            String[] progression = getNumbers(quantity, number1, difference);
            var correctAnswer = progression[0];

            for (var j = 0; j < quantity; j++) {
               if (j == point) {
                   correctAnswer = progression[j];
                   progression[j] = "..";
                }
            }
            String numbers = String.join(" ", progression);
            dataGame[i] = new String[] {numbers, String.valueOf(correctAnswer)};
        }
        Engine.run(dataGame, "What number is missing in the progression?");
    }

    public static String[] getNumbers(int quantity, int number1, int difference) {
        var progress = new String[quantity];
        progress[0] = String.valueOf(number1);
        for (var j = 1; j < quantity; j++) {
            progress[j] = String.valueOf(Integer.parseInt(progress[j - 1]) + difference);
        }
        return progress;
    }
}
