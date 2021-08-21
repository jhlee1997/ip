package duke;

import java.util.ArrayList;

/**
 * This class manages all requests made to the taskList.
 */
public class TaskList {
    protected ArrayList<Task> tasks;

    /**
     * Constructor for TaskList.
     *
     * @param tasks Stores the taskList memory as an ArrayList.
     */
    public TaskList(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * Method to add a task to the taskList.
     *
     * @param t The taks being added.
     */
    public void add(Task t) {
        tasks.add(t);
    }

    /**
     * Method to delete a task from the taskList.
     *
     * @param index Index of the task to remove from the taskList.
     * @return The task being deleted.
     */
    public Task delete(int index) {
        Task t = tasks.get(index);
        tasks.remove(index);
        return t;
    }

    /**
     * Method to mark a task as completed from the taskList.
     *
     * @param index Index of the task to select from the taskList.
     * @return The task being marked as completed.
     */
    public Task done(int index) {
        Task t = tasks.get(index);
        t.markAsDone();
        return t;
    }

    /**
     * Method to list the currently existing tasks.
     *
     * @return The String form that will be passed to Ui to be shown to the user.
     */
    public String list() {
        // list out all tasks
        int count = 1;
        StringBuilder result = new StringBuilder("     Here are the tasks in your list:\n");
        for (Task task : tasks) {
            result.append(String.format("     %d.%s\n", count, task));
            count++;
        }
        return result.toString();
    }

    /**
     * Method to return the size of the current taskList.
     *
     * @return The size of the current taskList.
     */
    public int size() {
        return tasks.size();
    }
}
