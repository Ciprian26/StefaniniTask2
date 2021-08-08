import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String userName;
    private List<Task> taskList = new ArrayList() ;
    private int taskNumbers = 0;

    public User() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addNewTask(Task task){
        taskList.add(task);
        taskNumbers++;
    }

    public void showTasks(){
        if(taskList.isEmpty()){
            System.out.println("No tasks");
        }else {
            for (Task task : taskList) {
                System.out.println(task.getTaskTitle() + " \n" + task.getTaskDescription());
            }
        }
    }

    public String toString(){
        return getFirstName() + " " + getLastName()+ " " + taskNumbers;
    }
}
