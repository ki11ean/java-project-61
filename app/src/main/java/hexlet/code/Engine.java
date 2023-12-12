package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int HOW_MANY_ROUNDS = 3;

    public static void engine(String gameRule, String[][] questionsChecks) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRule);

        for (var questionsCheck: questionsChecks) {
            System.out.println("Question: " + questionsCheck[0]);
            System.out.print("Your answer: ");

            String answer = scanner.next();

            if (answer.equals(questionsCheck[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + questionsCheck[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");

    }
}
