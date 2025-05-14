package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class Even {
    public static void runEven() {

        Random random = new Random();
        var dataGame = new String[ROUNDS][];
        final int limit = 100;
        for (var i = 0; i < ROUNDS; i++) {
            int number = random.nextInt(1, limit);
            var correctAnswer = number % 2 == 1 ? "no" : "yes";

            dataGame[i] = new String[] {String.valueOf(number), correctAnswer};
        }
        Engine.run(dataGame, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
