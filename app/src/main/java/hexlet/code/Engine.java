package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    private static String check = "";
    public static void engine(String numberGame) {

        switch (numberGame) {
            case "2" -> System.out.println(Even.gameRule());
            case "3" -> System.out.println(Calc.gameRule());
            case "4" -> System.out.println(GCD.gameRule());
            case "5" -> System.out.println(Progression.gameRule());
            case "6" -> System.out.println(Prime.gameRule());
            default -> System.exit(0);
        }

        final int howManyRounds = 3;
        var countRound = 0;
        var answer = "";
        //var check = "";

        Scanner scanner = new Scanner(System.in);

        while (countRound < howManyRounds) {
            switch (numberGame) {
                case "2" -> setCheck(Even.game());
                case "3" -> setCheck(Calc.game());
                case "4" -> setCheck(GCD.game());
                case "5" -> setCheck(Progression.game());
                case "6" -> setCheck(Prime.game());
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

        if (countRound == howManyRounds) {
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

    public static void setCheck(String checkGame) {
        check = checkGame;
    }
}
