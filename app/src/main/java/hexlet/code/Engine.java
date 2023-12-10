package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine(String gameRule, String[] questions, String[] checks) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameRule);
        var countRound = 0;
        var answer = "";

        while (countRound < App.HOWMANYROUNDS) {
            System.out.println("Question: " + questions[countRound]);
            System.out.print("Your answer: ");

            answer = scanner.next();

            if (answer.equals(checks[countRound])) {
                System.out.println("Correct!");
                countRound++;
            } else {
                break;
            }
        }

        if (countRound == App.HOWMANYROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + checks[countRound] + "'.");
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
