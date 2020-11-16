import java.util.Scanner;

public class TaskItem {
    private String title;
    private String description;
    private String date;
    private boolean isCompleted = false;

    Scanner in = new Scanner(System.in);

    public void setTitle(String Title) {
        this.title = Title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setDescription(String description) {
        //this.description = in.nextLine();
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }

    public void setDate(String date){
        //this.date = in.nextLine();
        this.date = date;
    }
    public String getDate(){
        return this.date;
    }
    public void markComplete(){
        this.isCompleted = true;
    }

    public void unmarkComplete(){
        this.isCompleted = false;
    }

    public boolean completionStatus(){
        return isCompleted;
    }

    @Override
    public String toString(){
        return("["+this.date+"] "+ this.title + ": " + this.description);
    }

}
