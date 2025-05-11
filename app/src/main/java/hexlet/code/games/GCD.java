package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class GCD {
	public static void getGCD() {

		Random random = new Random();
		var questions = new String[ROUNDS][];

		for (var i = 0; i < ROUNDS; i++) {

			int number1 = random.nextInt(1, 50);
			int number2 = random.nextInt(1, 50);
			var numb1 = number1;
			var numb2 = number2;


			while (number1 != 0 && number2 != 0) {
				if (number1 > number2) {
					number1 = number1 % number2;
				} else {
					number2 = number2 % number1;
				}
			}
			var correctAnswer = number1 + number2;

			questions[i] = new String[]{numb1 + " " + numb2, String.valueOf(correctAnswer)};
		}
		Engine.run(questions, "Find the greatest common divisor of given numbers.");
	}
}
