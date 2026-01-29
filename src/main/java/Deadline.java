package chatbot;

import java.time.LocalDate;

/**
 * Represents a deadline task.
 * A deadline task has a description and a due date.
 */
public class Deadline extends Task {
    private final LocalDate by;

    /**
     * Constructs a Deadline task with the given description and due date.
     *
     * @param description the description of the deadline task
     * @param by the due date of the task
     */
    public Deadline(String description, LocalDate by) {
        super(description);
        this.by = by;
    }

    /**
     * Returns the due date of this deadline task.
     *
     * @return the due date
     */
    public LocalDate getBy() {
        return by;
    }

    /**
     * Returns a string representation of this deadline task.
     * The format is "[D] [X] description (by: date)" if done,
     * "[D] [ ] description (by: date)" if not done.
     *
     * @return a string representation of the deadline task
     */
    @Override
    public String toString() {
        String formattedDate = DateTimeParser.formatDate(by);
        return "[D] " + super.toString() + " (by: " + formattedDate + ")";
    }
}
