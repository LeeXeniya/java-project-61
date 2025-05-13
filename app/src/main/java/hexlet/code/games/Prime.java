package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static void runPrime() {

        Random random = new Random();
        final int rounds = 3;
        var dataGame = new String[rounds][];
        final int limit = 100;

        for (var i = 0; i < rounds; i++) {
            int value = random.nextInt(1, limit);

            var correctAnswer = isSimple(value) ? "yes" : "no";

            dataGame[i] = new String[] {String.valueOf(value), correctAnswer};
        }
        Engine.run(dataGame, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
