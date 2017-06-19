import java.util.Scanner;

public class LetterCounterService {

    private LetterCounter inputType;

    public void setInputType(LetterCounter inputType) {
        this.inputType = inputType;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHOOSE INPUT TYPE AND PATTERN (EG. 1 abc)" +
                "\n1.Console" +
                "\n2.File" +
                "\n3.HTTP");
        int answer = sc.nextInt();
        String pattern = sc.next();
        switch (answer) {
            case 1:
                System.out.println("-CONSOLE-");
                this.inputType = new ConsoleCounter(new Scanner(System.in));
                System.out.println(">>> Word Patterns Found: " + inputType.countWords(pattern));
                break;
            case 2:
                System.out.println("-FILE-");
                System.out.println("Enter file path: ");
                this.inputType = new FileCounter(sc.next());
                System.out.println(">>> Word Patterns Found: " + inputType.countWords(pattern));
                break;
            case 3:
                System.out.println("-HTTP-");
                System.out.println("Enter file url: ");
                this.inputType = new HttpCounter("https://" + sc.next());
                System.out.println(">>> Word Patterns Found: " + inputType.countWords(pattern));
                break;
        }
    }
}
