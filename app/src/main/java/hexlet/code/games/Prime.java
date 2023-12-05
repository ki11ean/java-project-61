package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static String gameRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String game() {

        var randomNum = Engine.randomNumber();
        var check = "";
        System.out.println("Question: " + randomNum);

        if (randomNum >= 2) {

            var i = 2;
            while (i < randomNum) {
                if ((randomNum % i) == 0) {
                    break;
                } else {
                    i++;
                }
            }
            check = (i == randomNum) ? "yes" : "no";
        } else {
            check = "no";
        }
        return check;
    }
}
