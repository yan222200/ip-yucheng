package chatbot;

import java.time.LocalDateTime;

/**
 * Represents an event task.
 * An event task has a description, a start time, and an end time.
 */
public class Event extends Task {
    private final LocalDateTime from;
    private final LocalDateTime to;

    /**
     * Constructs an Event task with the given description, start time, and end time.
     *
     * @param description the description of the event task
     * @param from the start time of the event
     * @param to the end time of the event
     */
    public Event(String description, LocalDateTime from, LocalDateTime to) {
        super(description);
        this.from = from;
        this.to = to;
    }

    /**
     * Returns the start time of this event task.
     *
     * @return the start time
     */
    public LocalDateTime getFrom() {
        return from;
    }

    /**
     * Returns the end time of this event task.
     *
     * @return the end time
     */
    public LocalDateTime getTo() {
        return to;
    }

    /**
     * Returns a string representation of this event task.
     * The format is "[E] [X] description (from: start to: end)" if done,
     * "[E] [ ] description (from: start to: end)" if not done.
     *
     * @return a string representation of the event task
     */
    @Override
    public String toString() {
        String formattedFrom = DateTimeParser.formatDateTime(from);
        String formattedTo = DateTimeParser.formatDateTime(to);
        return "[E] " + super.toString() + " (from: " + formattedFrom + " to: " + formattedTo + ")";
    }
}
