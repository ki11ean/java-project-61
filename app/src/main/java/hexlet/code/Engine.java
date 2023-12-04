package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    public static String check;
    public static void engine(int numberGame) {

        var answer = "";
        final int howManyRounds = 3;

        switch (numberGame) {
            case 2 -> System.out.println(Even.greetingGame());
            case 3 -> System.out.println(Calc.greetingGame());
            case 4 -> System.out.println(GCD.greetingGame());
            case 5 -> System.out.println(Progression.greetingGame());
            case 6 -> System.out.println(Prime.greetingGame());
            default -> System.exit(0);
        }

        var countRound = 0;
        Scanner scanner = new Scanner(System.in);

        while (countRound < howManyRounds) {
            switch (numberGame) {
                case 2 -> Even.game();
                case 3 -> Calc.game();
                case 4 -> GCD.game();
                case 5 -> Progression.game();
                case 6 -> Prime.game();
                default -> throw new Error("Error while default Engine.java");
            }
            System.out.print("Your answer: ");

            answer = scanner.next();

            if (answer.equals(check)) {
                System.out.println("Correct!");
                countRound++;
            } else {
                break;
            }
        }

        if (countRound == 3) {
            System.out.println("Congratulations, " + Greet.getName() + "!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + check + "'.");
            System.out.println("Let's try again, " + Greet.getName() + "!");
        }
    }

    public static int randomNumber() {
        final int min = 1;
        final int max = 100;
        return (int) (Math.random() * max) + min;
    }
}
