package chatbot;

import java.util.ArrayList;

/**
 * Represents a fallback command that treats unrecognized input as a todo.
 * This maintains backward compatibility with the original behavior where
 * the input itself is also printed after creating the todo.
 */
public class FallbackTodoCommand extends Command {
    private final String input;

    /**
     * Constructs a FallbackTodoCommand with the given input string.
     *
     * @param input the input string to be treated as a todo task description
     */
    public FallbackTodoCommand(String input) {
        this.input = input;
    }

    /**
     * Executes the command by creating a todo task from the input and adding it to the task list.
     *
     * @param tasks the list of tasks
     * @param storage the storage handler
     * @return a message confirming the task was added, followed by the original input
     */
    @Override
    public String execute(ArrayList<Task> tasks, Storage storage) {
        Task task = new Todo(input);
        tasks.add(task);
        storage.save(tasks);
        return "Added: " + task + "\n" + input;
    }
}
