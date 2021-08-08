import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserarization {
    public static ArrayList<User> Deserilize(ArrayList<User> userList){
        try {
            FileInputStream fi = new FileInputStream("userList.ser");

            ObjectInputStream os = new ObjectInputStream(fi);

            userList = (ArrayList<User>)os.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
