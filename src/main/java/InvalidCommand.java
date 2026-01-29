package chatbot;

import java.util.ArrayList;

/**
 * Represents an invalid or unrecognized command.
 * This command is used when user input cannot be parsed into a valid command.
 */
public class InvalidCommand extends Command {
    private final String errorMessage;

    /**
     * Constructs an InvalidCommand with the given error message.
     *
     * @param errorMessage the error message to display to the user
     */
    public InvalidCommand(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * Executes the command by returning the error message.
     *
     * @param tasks the list of tasks (not used)
     * @param storage the storage handler (not used)
     * @return the error message
     */
    @Override
    public String execute(ArrayList<Task> tasks, Storage storage) {
        return errorMessage;
    }
}
