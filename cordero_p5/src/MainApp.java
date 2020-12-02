import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select your application\n---------\n\n" +
                "1) Task List Menu\n" +
                "2) Contact List menu\n" +
                "3) quit");
        while (true) {

            try {
                int choice = in.nextInt();
                in.nextLine();
                if (choice == 1) {
                    TaskApp.main();
                    System.out.println("Select your application\n---------\n\n" +
                            "1) Task List Menu\n" +
                            "2) Contact List menu\n" +
                            "3) quit");
                }
                if (choice == 2) {
                    ContactApp.main();
                    System.out.println("Select your application\n---------\n\n" +
                            "1) Task List Menu\n" +
                            "2) Contact List menu\n" +
                            "3) quit");
                }
                if (choice == 3) {
                    System.out.println("Have a good day! :)");
                    return;
                }

            } catch (InputMismatchException e) {
                System.out.println("That is not an option!");
                in.next();
            }

        }
    }
}
