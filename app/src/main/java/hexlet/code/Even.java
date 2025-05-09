package hexlet.code;


import java.util.Random;

import static hexlet.code.Engine.ROUNDS;

public class Even {
	public static void getEven() {

		Random random = new Random();
		var questions = new String[ROUNDS][];

		for (var i = 0; i < ROUNDS; i++) {
			int value = random.nextInt(1,100);

			var correctAnswer = value % 2 == 1 ? "yes" : "no";

			questions[i] = new String[] { String.valueOf(value), correctAnswer};
		}
		Engine.run(questions, "Answer 'yes' if the number is even, otherwise answer 'no'.");
	}
}
