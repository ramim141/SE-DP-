public abstract class WidgetDecorator implements Dashboard {
    protected Dashboard dashboard;

    public WidgetDecorator(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

    @Override
    public String display() {
        return dashboard.display();
    }

    @Override
    public void layout() {
        dashboard.layout();
    }
}