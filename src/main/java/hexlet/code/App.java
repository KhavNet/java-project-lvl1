package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static Scanner scApp = new Scanner(System.in);
    private static String key;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("""
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit""");
        key = scApp.next();
        Engine.letsPlay(getDataGame(), scApp);
        scApp.close();
    }
    public static String[] getDataGame() {
        String[] dataGame = {"", "", ""};
        switch (key) {
            case "1":
                Engine.getName(scApp);
                break;
            case "2":
                dataGame = Even.runGame();
                break;
            case "3":
                dataGame = Calc.runGame();
                break;
            case "4":
                dataGame = GCD.runGame();
                break;
            case "5":
                dataGame = Progression.runGame();
                break;
            case "6":
                dataGame = Prime.runGame();
                break;
            default:
                scApp.close();
                break;
        }
        return dataGame;
    }
}
