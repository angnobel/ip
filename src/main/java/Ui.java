import java.util.Scanner;

/**
 * Class handling interactions with the users
 */
public class Ui {
    private Scanner s = new Scanner(System.in);

    /**
     * Retrieve the next command from the user and executes it.
     */
    public String nextLine() {
        return s.nextLine();
    }

    public void printWelcome() {
        System.out.println("Hello! I'm Duke\nWhat can I do for you?");
    }

    public void printGoodbye() {
        System.out.println("Bye. Hope to see you again soon!");
    }


    public void printLoadSuccess() {
        System.out.println("Save file successfully loaded");
    }

    public void printList(TaskList tasks) {
        System.out.println("---------");
        System.out.println(tasks.toString());
        System.out.println("---------");
    }


    public void printDukeException(DukeException err) {
        System.out.println("---------");
        System.out.println("Error: " + err.getMessage());
        System.out.println("---------");
    }


    public void printMessage(String message) {
        System.out.println("---------");
        System.out.println(message);
        System.out.println("---------");
    }

    public void printNewTask(TaskList tasks) throws DukeException {
        System.out.println("---------");
        System.out.println("Got it. I've added this task:");
        System.out.println(tasks.get(tasks.count() - 1).toString());
        System.out.println("Now you have " + tasks.count() + " task in the list");
        System.out.println("---------");
    }

    public void printDoneTask(Task tasks) {
        System.out.println("---------");
        System.out.println("Nice! I've marked this task as done:");
        System.out.println(tasks);
        System.out.println("---------");
    }

    public void closeScanner() {
        s.close();
    }
}
