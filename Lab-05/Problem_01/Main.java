package Problem_01;

public class Main {
    public static void main(String[] args) {
        
        DatabaseConnection c1 = DatabaseConnection.getobj();
        DatabaseConnection c2 = DatabaseConnection.getobj();
        // c1.connect();
        // c1.disconnect();
        c1.connect();
        System.out.println("c1 is connected: " + c1.isConnected());
        c1.disconnect();
        System.out.println("c1 is connected: " + c1.isConnected());
        c2.connect();
        System.out.println("c2 is connected: " + c2.isConnected());

        
        
        
        

        
        
        
        
    }
}
