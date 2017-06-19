import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileCounter implements LetterCounter {

    private String path;
    private StringBuilder stringBuilder;

    public FileCounter(String path) {
        this.path = path;
        this.stringBuilder = new StringBuilder();
    }

    private void readInputFromFile() {

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(path)))) {
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine()).append(" ");
            }
        } catch (IOException e) {
            throw new RuntimeException("Caused by IOE" + e.getMessage());
        }
    }

    @Override
    public long countWords(String wordPattern) {
        readInputFromFile();
        String inputString = stringBuilder.toString();
        String[] splitString = inputString.split(" ");
        return Arrays.stream(splitString)
                .filter(string -> string.equals(wordPattern))
                .count();

    }
}
