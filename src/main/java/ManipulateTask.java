import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ManipulateTask {
    public static void addTask(List<User> userList) {
        System.out.println("Enter nickname of user: ");
        Scanner scanner = new Scanner(System.in);
        String inputUserName = scanner.nextLine();
        Task task = new Task();
        for (User user : userList) {
            if (Objects.equals(user.getUserName(), inputUserName)) {
                task.setUserName(inputUserName);
                System.out.println("Enter task title:");
                task.setTaskTitle(scanner.nextLine());
                System.out.println("Enter task description:");
                task.setTaskDescription(scanner.nextLine());
                user.addNewTask(task);
            }
        }
        System.out.println("Task assigned");
    }

    public static void showTasks(List<User> userList) {
        boolean flag = false;
        System.out.println("Enter user's nickname: ");
        Scanner scanner = new Scanner(System.in);
        String inputUserName = scanner.next();
        for (User user : userList) {
            if (Objects.equals(user.getUserName(), inputUserName)) {
                System.out.println(user.getUserName() + " has following tasks");
                user.showTasks();
                flag = true;
            }
        }
        if (!flag){
            System.out.println("There is no user with such nickname");
        }
    }
}
