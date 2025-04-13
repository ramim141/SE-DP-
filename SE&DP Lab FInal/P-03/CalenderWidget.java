public class CalenderWidget extends WidgetDecorator {
    public CalenderWidget(Dashboard dashboard) {
        super(dashboard);
    }

    @Override
    public String display() {
        return super.display() + " + Calendar Widget";
    }
    @Override
    public void layout() {
        // super.layout();
        System.out.println("Calendar Widget Layout");
    }
}