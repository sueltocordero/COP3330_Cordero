import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TaskListTest {

    @Test
    public void creatingTaskItemFailsWithInvalidDueDate(){
        TaskList Test = new TaskList();
        String trial =  Test.add("Task 1", "","");
        assertEquals("No Task",trial);
    }
    @Test
    public void creatingTaskItemFailsWithInvalidTitle(){
        TaskList Test = new TaskList();
        String trial =  Test.add("", "","2020-11-17");
        assertEquals("No Task",trial);
    }
    @Test
    public void creatingTaskItemSucceedsWithValidDueDate(){
        TaskList Test = new TaskList();
        String trial =  Test.add("Test", "","2020-11-17");
        assertEquals("Task Created!",trial);
    }
    @Test
    public void creatingTaskItemSucceedsWithValidTitle(){
        TaskList Test = new TaskList();
        String trial =  Test.add("Test", "","2020-11-17");
        assertEquals("Task Created!",trial);
    }



    /*@Test
    public void completingTaskItemFailsWithInvalidIndex(){}
    @Test
    public void editingTaskItemChangesValues(){}
    @Test
    public void editingTaskItemDescriptionChangesValue(){}
    @Test
    public void editingTaskItemDescriptionFailsWithInvalidIndex(){}
    @Test
    public void editingTaskItemDueDateChangesValue(){}
    @Test
    public void editingTaskItemDueDateFailsWithInvalidIndex(){}
    @Test
    public void editingTaskItemTitleChangesValue(){}
    @Test
    public void editingTaskItemTitleFailsWithInvalidIndex(){}
    @Test
    public void gettingTaskItemDescriptionFailsWithInvalidIndex(){}
    @Test
    public void gettingTaskItemDescriptionSucceedsWithValidIndex(){}
    @Test
    public void gettingTaskItemDueDateFailsWithInvalidIndex(){}
    @Test
    public void gettingTaskItemDueDateSucceedsWithValidIndex(){}
    @Test
    public void gettingTaskItemTitleFailsWithInvalidIndex(){}
    @Test
    public void gettingTaskItemTitleSucceedsWithValidIndex(){}
    @Test
    public void newTaskListIsEmpty(){}
    @Test
    public void removingTaskItemsDecreasesSize(){}
    @Test
    public void removingTaskItemsFailsWithInvalidIndex(){}
    @Test
    public void savedTaskListCanBeLoaded(){}
    @Test
    public void uncompletingTaskItemChangesStatus(){}
    @Test
    public void uncompletingTaskItemFailsWithInvalidIndex(){}

     */
}