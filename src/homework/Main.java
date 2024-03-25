package homework;

public class Main{
    public static void main(String[] args){
        Persister persister = new Persister("Bob");
        Save save = new Save();
        Report report = new Report();
        save.saveUser(persister.getUser());
        report.reportUser(persister.getUser());

    }
}