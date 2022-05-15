package hexlet.code.games;

public class GCD {
    private static final int SCOPE_RANDOM_NUMBERS = 100;
    public static String[] runGame() {
        String[] dataGame = {"", "", ""};
        dataGame[2] = "Find the greatest common divisor of given numbers.";
        int randomNumber1 = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
        int randomNumber2 = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
        dataGame[0] = randomNumber1 + " " + randomNumber2;
        dataGame[1] = Integer.toString(getGCD(randomNumber1, randomNumber2));
        return dataGame;
    }
    public static int getGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getGCD(number2, number1 % number2);
    }
}

