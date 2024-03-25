package homework;

public class Report implements Reportoble{
    @Override
    public void reportUser(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
