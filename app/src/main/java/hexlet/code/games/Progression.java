package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class Progression {
	public static void getProgression() {

		Random random = new Random();

		var questions = new String[ROUNDS][];

		for (var i = 0; i < ROUNDS; i++) {
			int number1 = random.nextInt(1, 100);
			int quantity = random.nextInt(5, 10);
			int point = random.nextInt(0, quantity - 1);
			int difference = random.nextInt(2, 10);

			var progress = new int[quantity];
			progress[0] = number1;
			for (var j = 1; j < quantity; j++) {
				progress[j] = progress[j - 1] + difference;
			}

			String numbers = "";
			var correctAnswer = progress[0];
			if (point != 0) {
				numbers = String.valueOf(progress[0]);
			} else {
				numbers = "..";
			}

			for (var k = 1; k < quantity; k++) {
				if (k != point) {
					numbers = numbers + " " + String.valueOf(progress[k]);
				} else {
					numbers = numbers + " ..";
					correctAnswer = progress[k];
				}
			}
			questions[i] = new String[] {numbers, String.valueOf(correctAnswer)};
		}
		Engine.run(questions, "What number is missing in the progression?");
	}
}
