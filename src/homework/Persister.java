package homework;

public class Persister {
    private User user;
    private final String name;
    public Persister(String name){
        this.name = name;
        user = new User(name);
    }

    public User getUser() {
        return user;
    }

    public String getName() {
        return name;
    }
}
