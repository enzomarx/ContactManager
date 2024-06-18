import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, User> users;
    private final String dataPath = "data/users/";

    public UserManager() {
        users = new HashMap<>();
        loadUsers();
    }

    private void loadUsers() {
        File userDir = new File(dataPath);
        if (userDir.exists() && userDir.isDirectory()) {
            for (File file : userDir.listFiles()) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                    User user = (User) ois.readObject();
                    users.put(user.getUsername(), user);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void saveUser(User user) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dataPath + user.getUsername() + ".txt"))) {
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public User getUser(String username) {
        return users.get(username);
    }

    public void addUser(User user) {
        users.put(user.getUsername(), user);
        saveUser(user);
    }
}
