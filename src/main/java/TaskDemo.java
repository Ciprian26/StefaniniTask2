import java.util.ArrayList;
import java.util.Scanner;

public class TaskDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<User>();

        userList = Deserarization.Deserilize(userList);

        System.out.println("Insert options \n createUser \n showAllUsers \n addTask \n showTasks");
        String option = scanner.nextLine();

        switch (option) {
            case "createUser":
                ManipulateUser.createNewUser(userList);
                Serialization.Serialize(userList);
                break;
            case "showAllUsers":
                ManipulateUser.showUser(userList);
                break;
            case "addTask":
                ManipulateTask.addTask(userList);
                Serialization.Serialize(userList);
                break;
            case "showTasks":
                ManipulateTask.showTasks(userList);
                break;
        }
    }
}

