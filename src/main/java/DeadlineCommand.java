package chatbot;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Represents a command to add a deadline task.
 */
public class DeadlineCommand extends Command {
    private final String description;
    private final LocalDate by;

    /**
     * Constructs a DeadlineCommand with the given description and due date.
     *
     * @param description the description of the deadline task to add
     * @param by the due date of the deadline task
     */
    public DeadlineCommand(String description, LocalDate by) {
        this.description = description;
        this.by = by;
    }

    /**
     * Executes the command to add a deadline task to the task list.
     *
     * @param tasks the list of tasks
     * @param storage the storage handler
     * @return a message confirming the task was added
     */
    @Override
    public String execute(ArrayList<Task> tasks, Storage storage) {
        Task task = new Deadline(description, by);
        tasks.add(task);
        storage.save(tasks);
        return "Added: " + task;
    }
}
