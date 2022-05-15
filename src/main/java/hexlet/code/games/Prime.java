package hexlet.code.games;


public class Prime {
    private static final int SCOPE_RANDOM_NUMBERS = 10;
    private static final int START_FIND_PRIME = 3;
    public static String[] runGame() {
        String[] dataGame = {"", "", ""};
        dataGame[2] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int randomNumber = (int) (1 + Math.random() * SCOPE_RANDOM_NUMBERS);
        dataGame[0] = Integer.toString(randomNumber);
        dataGame[1] = isItPrime(randomNumber);
        return dataGame;
    }
    private static String  isItPrime(int number) {
        if (number == 2) {
            return "yes";
        } else if ((number % 2 == 0) || (number == 1)) {
            return "no";
        } else {
            for (int i = START_FIND_PRIME; i * i <= number; i += 2) {
                if (number % i == 0) {
                    return "no";
                }
            }
            return "yes";
        }
    }
}
