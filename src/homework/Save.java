package homework;

public class Save implements Saveble{
    @Override
    public void saveUser(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
