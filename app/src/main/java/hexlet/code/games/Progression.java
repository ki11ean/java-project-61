package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static String greetingGame() {
        return "What number is missing in the progression?";
    }

    public static void game() {

        var number = Engine.randomNumber();
        var progressionDiff = 2 + (int) (Math.random() * 10);
        var progressionLength = 6 + (int) (Math.random() * 5);
        var unknownNumber = 2 + (int) (Math.random() * (progressionLength - 3));
        var resultProgression = new StringBuilder();
        var i = 0;

        resultProgression.append(number);

        while (i < progressionLength - 1) {

            resultProgression.append(" ");
            number += progressionDiff;

            if (i == unknownNumber) {
                resultProgression.append("..");
                Engine.check = Integer.toString(number);
            } else {
                resultProgression.append(number);
            }

            i++;
        }
        System.out.println("Question: " + resultProgression);
    }
}
