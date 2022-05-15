package hexlet.code.games;

public class Even {
    private static final int SCOPE_RANDOM_NUMBERS = 100;
    public static String[] runGame() {
        String[] dataGame = {"", "", ""};
        dataGame[2] = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int randomNumber = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
        dataGame[0] = Integer.toString(randomNumber);
        dataGame[1] = randomNumber % 2 == 0 ? "yes" : "no";
        return dataGame;
    }
}
