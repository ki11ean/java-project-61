package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void game() {

        var gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsChecks = new String[Engine.HOW_MANY_ROUNDS][2];

        for (var questionsCheck: questionsChecks) {
            final int number = Utils.generateNumber(1, 100);
            questionsCheck[0] = Integer.toString(number);
            questionsCheck[1] = ((number % 2) == 0) ? "yes" : "no";
        }
        Engine.engine(gameRule, questionsChecks);
    }
}
