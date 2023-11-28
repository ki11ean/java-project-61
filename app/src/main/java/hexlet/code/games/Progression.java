package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static String greetingGame() {
        return "What number is missing in the progression?";
    }

    public static void game() {

        var number = Engine.randomNumber();
        var progressionDiff = (int) (1 + Math.random() * 10);
        var progressionLength = (int) (5 + Math.random() * 7);
        var unknownNumber = (int) (1 + Math.random() * (progressionLength - 1));
        var resultProgression = new StringBuilder();
        var i = 0;

        resultProgression.append(number);

        while (i < progressionLength) {

            number = number + progressionDiff;
            resultProgression.append(" ");
            if (i == unknownNumber) {
                resultProgression.append("..");
                Engine.check = Integer.toString(number);
            } else {
                resultProgression.append(number);
            }
            i++;
        }
        System.out.println(resultProgression);
    }
}
