package hospital;

public class Database {
    private static Database instance = null;

    private Database() {
        System.out.println("DB Connection Created.");
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to Database.");
    }
}