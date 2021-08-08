import java.io.Serializable;

public class Task implements Serializable {
    private String taskTitle;
    private String taskDescription;
    private String userName;

    public Task(String taskTitle, String taskDescription, String userName) {
        this.userName = userName;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
    }

    public Task() {

    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
