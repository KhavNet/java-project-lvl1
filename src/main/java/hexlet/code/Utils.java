package hexlet.code;

public class Utils {

    public static int getRnd(int varForMaxRndNumber) {
        return (int) (Math.random() * varForMaxRndNumber);
    }

    public static int getRnd(int varForMaxRndNumber, int varForMinRndNumber) {
        return (int) (varForMinRndNumber + Math.random() * varForMaxRndNumber);
    }
}
