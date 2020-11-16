
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {


    public static void listOperationMenu(){
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        TaskList taskListPog = new TaskList();
        while (true) {

            try {
                System.out.println("List Operation Menu\n---------\n\n" + "1) view the list\n" + "2) add an item\n" + "3) edit an item\n" + "4) remove an item\n" + "5) mark an item as completed\n" + "6) unmark an item as completed\n" + "7) save the current list\n" + "8) quit to the main menu\n");
                int choice = in.nextInt();
                if (choice == 1) {
                    taskListPog.view();
                }
                if (choice == 2) {
                    System.out.print("Title:");
                    String title = in2.nextLine();
                    System.out.print("Description:");
                    String desc = in2.nextLine();
                    System.out.print("Task Due Date (YYYY-MM-DD):");
                    String date = in2.nextLine();

                    taskListPog.add(title,desc,date);
                }
                if (choice == 3) {
                    taskListPog.view();
                    System.out.println("Which task will you edit?");
                    taskListPog.edit();
                }
                if (choice == 4) {
                    taskListPog.view();
                    System.out.println("Which task will you remove?");
                    taskListPog.remove();
                }
                if (choice == 5) {
                    taskListPog.view();
                    System.out.println("Which task do you want to mark as complete? ");
                    taskListPog.markAsComplete();
                }
                if (choice == 6) {
                    taskListPog.view();
                    System.out.println("Which task do you want to mark as incomplete? ");
                    taskListPog.markAsIncomplete();
                }
                if (choice == 7) {
                    System.out.println("THis is option 7 ");
                }
                if (choice == 8) {
                    System.out.println("Main Menu\n---------\n\n" +
                            "1) Create a new list\n" +
                            "2) Load an existing list\n" +
                            "3) quit");
                    break;
                }
                if (choice < 0 || choice > 8) {
                    System.out.println("Not an option!");
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
                   System.out.println("new task list has been created\n ");
                   listOperationMenu();


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