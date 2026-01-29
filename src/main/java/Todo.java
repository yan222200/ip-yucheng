package chatbot;

/**
 * Represents a todo task.
 * A todo task is a task without any date or time.
 */
public class Todo extends Task {
    /**
     * Constructs a Todo task with the given description.
     *
     * @param description the description of the todo task
     */
    public Todo(String description) {
        super(description);
    }

    /**
     * Returns a string representation of this todo task.
     * The format is "[T] [X] description" if done, "[T] [ ] description" if not done.
     *
     * @return a string representation of the todo task
     */
    @Override
    public String toString() {
        return "[T] " + super.toString();
    }
}
