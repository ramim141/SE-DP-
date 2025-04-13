public class Main {
    public static void main(String[] args) {
        Dashboard dashboard = new BasicDashboard();
        System.out.println(dashboard.display());

        dashboard = new WeatherWidget(dashboard);
        System.out.println(dashboard.display());

        dashboard = new NewsWidget(dashboard);
        System.out.println(dashboard.display());

        dashboard = new StockWidget(dashboard);
        System.out.println(dashboard.display());

        dashboard = new CalenderWidget(dashboard);
        System.out.println(dashboard.display());
    }
}