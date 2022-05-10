package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scApp = new Scanner(System.in);
        String key = "0";
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("""
            1 - Greet
            2 - Even
            3 - Calc
            0 - Exit""");
        key = scApp.next();
        if (!key.equals("0")) {
            Engine.runGame(key, scApp);
        }
        scApp.close();
    }
}
