public class WeatherWidget extends WidgetDecorator {
    public WeatherWidget(Dashboard dashboard) {
        super(dashboard);
    }

    @Override
    public String display() {
        return super.display() + " + Weather Widget";
    }
    @Override
    public void layout() {
        // super.layout();
        System.out.println("Weather Widget Layout");
    }
}