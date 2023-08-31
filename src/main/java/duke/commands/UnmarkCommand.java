package duke.commands;

import java.io.IOException;
import duke.data.TaskList;
import duke.ui.Ui;
import duke.storage.Storage;
import duke.data.exception.DukeException;

public class UnmarkCommand extends Command {

    private final int taskID;

    public UnmarkCommand(int taskID) throws DukeException {
        if (taskID < 1)
            throw new DukeException("☹ OOPS!!! Invalid Task ID.");
        this.taskID = taskID;
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException, IOException {
        taskList.unmarkTask(taskList.getTask(taskID - 1));
        ui.showUnmarked(taskList.getTask(taskID - 1));
        Storage.save(taskList);
    }
}
