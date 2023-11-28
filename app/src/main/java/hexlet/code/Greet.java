package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static String name;
    public static void greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        name = userName;

        if (App.numberGame == 1) {
            System.exit(0);
        }
    }
}
