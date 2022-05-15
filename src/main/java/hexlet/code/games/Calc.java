package hexlet.code.games;

public class Calc {
    private static final int SCOPE_RANDOM_NUMBERS = 100;
    private static final int SCOPE_RANDOM_NUMBERS2 = 3;
    public static String[] runGame() {
        String[] dataGame = {"", "", ""};
        dataGame[2] = "What is the result of the expression?";
        int randomNumber1 = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
        int randomNumber2 = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
        int randomNumberForOperation = (int) (Math.random() * SCOPE_RANDOM_NUMBERS2);
        switch (randomNumberForOperation) {
            case 0:
                dataGame[0] = randomNumber1 + " + " + randomNumber2;
                dataGame[1] = Integer.toString(randomNumber1 + randomNumber2);
                break;
            case 1:
                dataGame[0] = randomNumber1 + " - " + randomNumber2;
                dataGame[1] = Integer.toString(randomNumber1 - randomNumber2);
                break;
            case 2:
                dataGame[0] = randomNumber1 + " * " + randomNumber2;
                dataGame[1] = Integer.toString(randomNumber1 * randomNumber2);
                break;
            default:
                break;
        }
        return dataGame;
    }
}
