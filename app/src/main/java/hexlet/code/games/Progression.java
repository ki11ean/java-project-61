package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static String greetingGame() {
        return "What number is missing in the progression?";
    }

    public static void game() {

        var number = Engine.randomNumber();
        var progressionDiff = (int) (2 + Math.random() * 10);
        var progressionLength = (int) (6 + Math.random() * 4);
        var unknownNumber = (int) (2 + Math.random() * (progressionLength - 3));
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
