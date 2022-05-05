package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scApp = new Scanner(System.in);
        int key = 0;
        do {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("""
                1 - Greet
                2 - Even
                0 - Exit""");
            key = scApp.nextInt();
            switch (key) {
                case 1:
                    Greet.getName(scApp);
                    break;
                case 2:
                    String name = Greet.getName(scApp);
                    Even.isItParity(scApp, name);
                    break;
                case 0:
                default:
            }
        } while (key != 0);
        scApp.close();
    }
}
