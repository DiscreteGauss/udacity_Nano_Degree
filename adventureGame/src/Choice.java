import java.util.InputMismatchException;
import java.util.Scanner;

public class Choice {
    Scanner scanner = new Scanner(System.in);

    int getChoice() {
        int choice = 0;
        int iteration = 0;
        while(!(choice == 1 || choice == 2) && iteration < 100) {
            iteration ++;
            try {
                while (!(choice >= 1 && choice <= 2)) {
                    System.out.println("");
                    System.out.print("Enter 1 or 2: ");
                    choice = scanner.nextInt();
                    System.out.println("You have selected " + choice);
                    return choice;
                }
            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.println("You may only enter a 1 or 2");
                scanner = new Scanner(System.in);
            }
        }
        return choice;
    }
}
