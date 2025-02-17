package Problem_01;

public class DatabaseConnection {
    private static DatabaseConnection obj;
    private boolean ok;

    private DatabaseConnection() {

        ok = true;
        System.out.println("DatabaseConnection obj created.");
    }

    public static DatabaseConnection getobj() {
        if (obj == null) {
            obj = new DatabaseConnection();
        }
        return obj;
    }

    // connect()
    public void connect() {
        ok = true;
        System.out.println("Database connected.");
    }

    // disconnect()
    public void disconnect() {
        ok = false;
        System.out.println("Database disconnected.");
    }

    public boolean isConnected() {
        return ok;
    }
}
