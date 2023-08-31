import java.io.IOException;
import java.util.Date;

public class AddDeadlineCommand extends Command {
    private final String description;
    private final Date by;

    public AddDeadlineCommand(String description, Date by) {
        this.description = description;
        this.by = by;
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws IOException {
        Deadline newDeadline = new Deadline(description, by);
        taskList.addTask(newDeadline);
        Storage.save(newDeadline);
        ui.showTaskAdded(newDeadline, taskList.countTasks());
    }
}
