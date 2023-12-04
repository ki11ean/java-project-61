package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    public static String check;     //переменная проверки
    public static void engine() {

        var answer = "";

        switch (App.numberGame) {
            case 2 -> System.out.println(Even.greetingGame());
            case 3 -> System.out.println(Calc.greetingGame());
            case 4 -> System.out.println(GCD.greetingGame());
            case 5 -> System.out.println(Progression.greetingGame());
            case 6 -> System.out.println(Prime.greetingGame());
            default -> System.exit(0);
        }

        var i = 0;
        Scanner scanner = new Scanner(System.in);

        while (i < 3) {
            switch (App.numberGame) {
                case 2 -> Even.game();
                case 3 -> Calc.game();
                case 4 -> GCD.game();
                case 5 -> Progression.game();
                case 6 -> Prime.game();
                default -> throw new Error("Error while default Engine.java");
            }
            System.out.print("Your answer: ");

            answer = scanner.next();

            if (answer.equals(Engine.check)) {
                System.out.println("Correct!");
                i++;
            } else {
                i = 4;
            }
        }

        if (i == 3) {
            System.out.println("Congratulations, " + Greet.name + "!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + check + "'.");
            System.out.println("Let's try again, " + Greet.name + "!");
        }
    }

    public static int randomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
