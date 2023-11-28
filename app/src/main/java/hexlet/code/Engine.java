package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    public static int i;   //счётчик игр
    public static String check;     //переменная проверки
    public static String answer;    //переменная клиента
    public static void engine() {

        switch (App.numberGame) {
            case 2:
                System.out.println(Even.greetingGame());
                break;
            case 3:
                System.out.println(Calc.greetingGame());
                break;
            case 4:
                System.out.println(GCD.greetingGame());
                break;
            case 5:
                System.out.println(Progression.greetingGame());
                break;
            default:
                System.exit(0);
        }

        i = 0;
        Scanner scanner = new Scanner(System.in);

        while (i < 3) {
            switch (App.numberGame) {
                case 1:
                    i = 4;
                    break;
                case 2:
                    Even.game();
                    break;
                case 3:
                    Calc.game();
                    break;
                case 4:
                    GCD.game();
                    break;
                case 5:
                    Progression.game();
                    break;
                default:
                    throw new Error("Error while default Engine.java");
            }
            System.out.print("Your answer: ");

            Engine.answer = scanner.next();

            if (Engine.answer.equals(Engine.check)) {
                System.out.println("Correct!");
                Engine.i++;
            } else {
                Engine.i = 4;
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
