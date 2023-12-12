package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void game() {

        var gameRule = "What number is missing in the progression?";
        String[][] questionsChecks = new String[Engine.HOW_MANY_ROUNDS][2];

        for (var questionsCheck: questionsChecks) {
            final int firstNumberProgression = Utils.generateNumber(1, 100);
            final int progressionDiff = Utils.generateNumber(2, 12);
            final int progressionLength = Utils.generateNumber(6, 12);
            final int hiddenMemberIndex = Utils.generateNumber(2, progressionLength - 5);

            String[] progressions = makeProgressions(firstNumberProgression, progressionDiff, progressionLength);
            questionsCheck[1] = progressions[hiddenMemberIndex];
            progressions[hiddenMemberIndex] = "..";
            questionsCheck[0]  = String.join(" ", progressions);
        }
        Engine.engine(gameRule, questionsChecks);
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
