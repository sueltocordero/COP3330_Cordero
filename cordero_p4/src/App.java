import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {


    public static void listOperationMenu(){
        Scanner in = new Scanner(System.in);
        ArrayList<TaskList> taskListsPog = new ArrayList<TaskList>();
        System.out.println("List Operation Menu\n---------\n\n" + "1) view the list\n" + "2) add an item\n" + "3) edit an item\n" + "4) remove an item\n" + "5) mark an item as completed\n" + "6) unmark an item as completed\n" + "7) save the current list\n" + "8) quit to the main menu\n");
        while (true) {

            try {
                int choice = in.nextInt();
                if (choice == 1) {
                    System.out.println("THis is option 1 ");
                }
                if (choice == 2) {
                    System.out.println("THis is option 2 ");
                }
                if (choice == 3) {
                    System.out.println("THis is option 3 ");
                }
                if (choice == 4) {
                    System.out.println("THis is option 4 ");
                }
                if (choice == 5) {
                    System.out.println("THis is option 5 ");
                }
                if (choice == 6) {
                    System.out.println("THis is option 6 ");
                }
                if (choice == 7) {
                    System.out.println("THis is option 7 ");
                }
                if (choice == 8) {
                    System.out.println("THis is option 8 ");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("That is not an option!");
                in.next();
            }

        }


    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Main Menu\n---------\n\n" +
                "1) Create a new list\n" +
                "2) Load an existing list\n" +
                "3) quit");

        while (true) {

           try {
               int choice = in.nextInt();
               if (choice == 1) {
                   //listOperationMenu();
                   System.out.println("THis is option 1 ");

               }
               if (choice == 2) {
                   //load new list here, use another scanner to get the input of the name
                   // and load file io with name in text
                   System.out.println("THis is option 2 ");

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