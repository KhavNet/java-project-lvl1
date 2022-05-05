package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static String getName(Scanner sc) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
