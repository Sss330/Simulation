import java.util.Scanner;

public class GameStarter {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String EXIT_VALUE = "s";
    private static final String PROMPT_MESSAGE = "введите любю букву или слово: ";

    public void startMenu() {
        System.out.println(PROMPT_MESSAGE);
        String input = SCANNER.nextLine();
        if (input.equals(EXIT_VALUE)) {
            System.exit(0);
        } else {
            printError();
        }
    }

    private static void printError() {
        System.out.println("ошибка");
    }
}