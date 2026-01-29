package chatbot;

/**
 * Represents a task in the task list.
 * A task has a description and can be marked as done or not done.
 */
public class Task {
    private final String description;
    private boolean isDone;

    /**
     * Constructs a Task with the given description.
     * The task is initially marked as not done.
     *
     * @param description the description of the task
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Marks this task as done.
     */
    public void markDone() {
        this.isDone = true;
    }

    /**
     * Marks this task as not done.
     */
    public void unmarkDone() {
        this.isDone = false;
    }

    /**
     * Returns the description of this task.
     *
     * @return the task description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns whether this task is done.
     *
     * @return true if the task is done, false otherwise
     */
    public boolean isDone() {
        return isDone;
    }

    /**
     * Returns a string representation of this task.
     * The format is "[X] description" if done, "[ ] description" if not done.
     *
     * @return a string representation of the task
     */
    @Override
    public String toString() {
        return (isDone ? "[X] " : "[ ] ") + description;
    }
}
