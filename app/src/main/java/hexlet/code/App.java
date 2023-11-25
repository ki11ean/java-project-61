package hexlet.code;

import java.util.Scanner;

public class App {

    public static int numberGame;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        String number = scanner.next();

        numberGame = Integer.parseInt(number);

        Engine.engine();
    }
}
