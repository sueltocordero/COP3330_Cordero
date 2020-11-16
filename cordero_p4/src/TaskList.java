import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskList extends TaskItem{


    private ArrayList<TaskItem> listOfTasks= new ArrayList<TaskItem>();


    Scanner in = new Scanner(System.in);
    Scanner in2 = new Scanner(System.in);
    public String add(String title, String desc, String Date){
            TaskItem item = new TaskItem();
            //System.out.print("Title:");
            item.setTitle(title);
            //System.out.print("Description:");
            item.setDescription(desc);
            //System.out.print("Task Due Date (YYYY-MM-DD):");
            item.setDate(Date);
            if(item.getTitle().isEmpty()){
                System.out.println("WARNING: Title must have at least 1 character; task not created");
                return "No Task";
            }
            if(item.getDate().isEmpty()){
                System.out.println("WARNING: Invalid Due date; task not created");
                return "No Task";
            }
            listOfTasks.add(item);

        return "Task Created!";
    }
    public void edit(){
        try {
            int choice = in.nextInt();

            System.out.print("Enter a new title for task "+choice+":");
            String title = in2.nextLine();
            listOfTasks.get(choice).setTitle(title);
            System.out.print("Enter a new description for task "+choice+":");
            String desc = in2.nextLine();
            listOfTasks.get(choice).setDescription(desc);
            System.out.print("Enter a new task due date (YYYY-MM-DD) for task "+choice+":");
            String date = in2.nextLine();
            listOfTasks.get(choice).setDate(date);
        }catch(InputMismatchException e) {
            System.out.println("Enter a proper value!");
            in.next();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Out of Bounds!!!");
            in.next();
        }
    }
    public void remove(){
        try {
            int removalChoice = in.nextInt();
            listOfTasks.remove(removalChoice);
        }catch(InputMismatchException e){
            System.out.println("Enter a proper value!");
            in.next();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Out of Bounds!!!");
            in.next();
        }
    }
    public String markAsComplete(){
        try {
            int completionChoice = in.nextInt();
            listOfTasks.get(completionChoice).markComplete();
            System.out.println("Completed Tasks\n----------");
            for (int i = 0; i < listOfTasks.size(); i++) {
                if (listOfTasks.get(i).completionStatus()) {
                    System.out.println(i + ")" + listOfTasks.get(i).toString());
                }
            }

        }catch(InputMismatchException e){
            System.out.println("Enter a proper value!");
            in.next();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Out of Bounds!!!");
            in.next();
        }
        return "Marked as complete!";
    }
    public void markAsIncomplete(){
        try {
            int uncompletionChoice = in.nextInt();
            listOfTasks.get(uncompletionChoice).unmarkComplete();
            System.out.println("Uncompleted Tasks\n----------");
            for (int i = 0; i<listOfTasks.size();i++) {
                if(!listOfTasks.get(i).completionStatus()){
                    System.out.println(i +")" +listOfTasks.get(i).toString());
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Enter a proper value!");
            in.next();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Out of Bounds!!!");
            in.next();
        }
    }
    public void view() {
        System.out.println("Current Tasks\n----------\n");
        for (int i = 0; i<listOfTasks.size();i++) {

            System.out.print(i +")");

            if(listOfTasks.get(i).completionStatus()){
                System.out.print("**COMPLETED**");
            }
            System.out.print(listOfTasks.get(i).toString()+"\n");
        }
    }
}
