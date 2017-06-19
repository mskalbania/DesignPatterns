import java.util.Arrays;
import java.util.Scanner;

public class ConsoleCounter implements LetterCounter {

    private Scanner consoleScanner;
    private StringBuilder stringBuilder;

    public ConsoleCounter(Scanner consoleScanner) {
        this.consoleScanner = consoleScanner;
        stringBuilder = new StringBuilder();
    }

    private void readInputFromConsole() {
        stringBuilder.append(consoleScanner.nextLine());
    }

    @Override
    public long countWords(String wordPattern) {
        readInputFromConsole();
        String inputString = stringBuilder.toString();
        String[] splitString = inputString.split(" ");
        return Arrays.stream(splitString)
                .filter(string -> string.equals(wordPattern))
                .count();

    }
}
