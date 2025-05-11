package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class Even {
    public static void getEven() {
        Random random = new Random();
        var questions = new String[ROUNDS][];
        final int limit = 100;
        for (var i = 0; i < ROUNDS; i++) {
            int value = random.nextInt(1, limit);
            var correctAnswer = value % 2 == 1 ? "no" : "yes";

            questions[i] = new String[] {String.valueOf(value), correctAnswer};
        }
        Engine.run(questions, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
