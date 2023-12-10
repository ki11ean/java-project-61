package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static void game() {

        var gameRule = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[App.HOWMANYROUNDS];
        String[] checks = new String[App.HOWMANYROUNDS];

        var countRound = 0;

        while (countRound < App.HOWMANYROUNDS) {
            final int numberOne = Utils.generateNumber(1, 100);
            final int numberTwo = Utils.generateNumber(1, 100);
            questions[countRound] = numberOne + " " + numberTwo;
            checks[countRound] = checkGCD(numberOne, numberTwo);
            countRound++;
        }
        Engine.engine(gameRule, questions, checks);
    }

    public static String checkGCD(int numberOne, int numberTwo) {
        while (numberTwo != 0) {
            int tmp = numberOne % numberTwo;
            numberOne = numberTwo;
            numberTwo = tmp;
        }
        return Integer.toString(numberOne + numberTwo);
    }
}
