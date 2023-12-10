package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void game() {

        var gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[App.HOWMANYROUNDS];
        String[] checks = new String[App.HOWMANYROUNDS];

        var countRound = 0;

        while (countRound < App.HOWMANYROUNDS) {
            var number = Utils.generateNumber(1, 100);
            questions[countRound] = Integer.toString(number);
            checks[countRound] = ((number % 2) == 0) ? "yes" : "no";
            countRound++;
        }
        Engine.engine(gameRule, questions, checks);
    }
}
