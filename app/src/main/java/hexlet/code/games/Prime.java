package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void game() {

        var gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[] questions = new String[App.HOWMANYROUNDS];
        String[] checks = new String[App.HOWMANYROUNDS];

        var countRound = 0;

        while (countRound < App.HOWMANYROUNDS) {
            var number = Utils.generateNumber(1, 100);
            questions[countRound] = Integer.toString(number);
            checks[countRound] = checkPrime(number);
            countRound++;
        }
        Engine.engine(gameRule, questions, checks);
    }

    public static String checkPrime(int number) {
        if (number >= 2) {

            var i = 2;
            while (i < number) {
                if ((number % i) == 0) {
                    break;
                } else {
                    i++;
                }
            }
            return  (i == number) ? "yes" : "no";
        } else {
            return "no";
        }

    }
}
