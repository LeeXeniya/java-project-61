package hexlet.code;

import java.util.Scanner;

public class Even {
	public static void getEven() {
		System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
		var count = 0;
		int[] numbers = {15, 6, 7};
		var userName = Cli.getName();
		Scanner scanner = new Scanner(System.in);

		for (var i = 0; i < numbers.length; i++) {
			System.out.println("Question: " + numbers[i]);
			System.out.print("Your answer: ");
			String userAnswer = scanner.nextLine();

			if (numbers[i] % 2 == 1 && userAnswer.equals("yes")) {
				System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
				System.out.println("Let's try again, " + userName);
				break;
			} else if (numbers[i] % 2 == 0 && userAnswer.equals("no")) {
				System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
				System.out.println("Let's try again, " + userName);
				break;
			} else if (numbers[i] % 2 == 0 && userAnswer.equals("yes") || numbers[i] % 2 == 1 && userAnswer.equals("no")) {
				System.out.println("Correct!");
			} else {
				break;
			}
			count++;
		}
		if (count == 3) {
			System.out.println("Congratulations, " + userName);
		}
	}
}
