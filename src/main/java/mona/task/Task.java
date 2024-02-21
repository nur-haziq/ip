package mona.task;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] " + this.description;
    }
    public String getStatusIcon() {
        return (isDone ? "X" : " "); //mark done task with "X"
    }
    public void markAsDone() {
        isDone = true;
    }
    public void markAsNotDone() {
        isDone = false;
    }
}