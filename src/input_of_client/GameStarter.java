package input_of_client;

import java.util.Scanner;

public class GameStarter {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String EXIT_VALUE = "s";

    public void startMenu() {
        while (true) {
            try {
                System.out.print("Введите что-то кроме 's', или 's', чтобы выйти: ");
                String input = SCANNER.nextLine();
                if (input.equals(EXIT_VALUE)) {
                    System.out.println("Выход из программы...");
                    System.exit(0);
                }else {
                    break;
                }
            }catch (Exception e){
                System.out.println("ошибка");
            }
        }
    }
}