import java.io.*;
import java.util.ArrayList;

public class Serialization {
    public static void Serialize(ArrayList<User> userList){

        try {
            FileOutputStream fs = new FileOutputStream("userList.ser");

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(userList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
