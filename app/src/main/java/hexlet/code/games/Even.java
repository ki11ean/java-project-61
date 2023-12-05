package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static String gameRule() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String game() {

        var check = "";
        var randomNum = Engine.randomNumber();

        check = ((randomNum % 2) == 0) ? "yes" : "no";
        System.out.println("Question: " + randomNum);
        return check;
    }
}
