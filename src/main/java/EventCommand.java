package chatbot;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Represents a command to add an event task.
 */
public class EventCommand extends Command {
    private final String description;
    private final LocalDateTime from;
    private final LocalDateTime to;

    /**
     * Constructs an EventCommand with the given description, start time, and end time.
     *
     * @param description the description of the event task to add
     * @param from the start time of the event
     * @param to the end time of the event
     */
    public EventCommand(String description, LocalDateTime from, LocalDateTime to) {
        this.description = description;
        this.from = from;
        this.to = to;
    }

    /**
     * Executes the command to add an event task to the task list.
     *
     * @param tasks the list of tasks
     * @param storage the storage handler
     * @return a message confirming the task was added
     */
    @Override
    public String execute(ArrayList<Task> tasks, Storage storage) {
        Task task = new Event(description, from, to);
        tasks.add(task);
        storage.save(tasks);
        return "Added: " + task;
    }
}
