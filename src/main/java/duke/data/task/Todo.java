package duke.data.task;
public class Todo  extends Task {
    public Todo (String description) {
        super(description);
    }

    @Override
    public String toWrite() {
        return "T | " + super.toWrite() + "\n";
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
