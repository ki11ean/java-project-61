package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void game() {

        var gameRule = "What number is missing in the progression?";
        String[] questions = new String[App.HOWMANYROUNDS];
        String[] checks = new String[App.HOWMANYROUNDS];

        var countRound = 0;

        while (countRound < App.HOWMANYROUNDS) {
            var firstNumberProgression = Utils.generateNumber(1, 100);
            var progressionDiff = Utils.generateNumber(2, 12);
            var progressionLength = Utils.generateNumber(6, 12);
            var hiddenMemberIndex = Utils.generateNumber(2, progressionLength - 5);

            String[] progressions = makeProgressions(firstNumberProgression, progressionDiff, progressionLength);
            checks[countRound] = progressions[hiddenMemberIndex];
            progressions[hiddenMemberIndex] = "..";
            questions[countRound] = String.join(" ", progressions);

            countRound++;
        }
        Engine.engine(gameRule, questions, checks);
    }

    public static String[] makeProgressions(int firstNumberProgression, int progressionDiff, int progressionLength) {
        String[] progressions = new String[progressionLength];
        progressions[0] = Integer.toString(firstNumberProgression);
        var i = 1;
        var numberProgression = firstNumberProgression;
        while (i < progressionLength - 1) {
            numberProgression = numberProgression + progressionDiff;
            progressions[i] = Integer.toString(numberProgression);
            i++;
        }
        return progressions;
    }
}
