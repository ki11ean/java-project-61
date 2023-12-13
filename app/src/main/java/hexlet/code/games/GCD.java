package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void game() {

        var gameRule = "Find the greatest common divisor of given numbers.";
        String[][] questionsChecks = new String[Engine.HOW_MANY_ROUNDS][2];

        for (var questionsCheck: questionsChecks) {
            final int numberOne = Utils.generateNumber(1, 100);
            final int numberTwo = Utils.generateNumber(1, 100);
            questionsCheck[0] = numberOne + " " + numberTwo;
            questionsCheck[1] = Integer.toString(gcd(numberOne, numberTwo));
        }
        Engine.engine(gameRule, questionsChecks);
    }

    public static int gcd(int numberOne, int numberTwo) {
        while (numberTwo != 0) {
            int tmp = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = tmp;
        }
        return numberOne + numberTwo;
    }
}
