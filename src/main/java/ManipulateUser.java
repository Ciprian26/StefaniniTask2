import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ManipulateUser {

    public static void createNewUser(List<User> userList) {
        User user = new User();
        boolean isSameNickname = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user first name:");
        user.setFirstName(scanner.next());

        System.out.println("Enter user last name:");
        user.setLastName(scanner.next());

        System.out.println("Enter user nickname:");
        user.setUserName(scanner.next());

        for (User tempUser : userList) {
            if (Objects.equals(tempUser.getUserName(), user.getUserName())) {
                System.out.println("ERROR \nAlready an user with such nickname");
                isSameNickname = true;
            }
        }
        if (!isSameNickname) {
            userList.add(user);
        }
        System.out.println("User added and saved in userList.ser");
    }

    public static void showUser(ArrayList<User> userList){
        for(User user : userList){
            System.out.println(user.toString());
        }
    }
}
