package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUNDS;

public class Prime {
	public static void getPrime() {
		Random random = new Random();
		var questions = new String[ROUNDS][];

		for (var i = 0; i < ROUNDS; i++) {
			int value = random.nextInt(1, 100);

			var correctAnswer = isSimple(value) ? "yes" : "no";

			questions[i] = new String[] {String.valueOf(value), correctAnswer};
		}
		Engine.run(questions, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
	}

	public static boolean isSimple(Integer number) {
		if (number < 2) return false;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
