import javafx.application.Application;

/**
 * A launcher class to work around JavaFX classpath issues.
 */
public class Launcher {

    /**
     * Launches the JavaFX application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}

