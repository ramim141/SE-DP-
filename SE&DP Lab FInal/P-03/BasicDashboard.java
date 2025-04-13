public class BasicDashboard implements Dashboard {
    @Override
    public String display() {
        return "Basic Dashboard";
    }

    @Override
    public void layout() {
        System.out.println("Basic Dashboard Layout");
    }
}

