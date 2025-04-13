public class NewsWidget extends WidgetDecorator {
    public NewsWidget(Dashboard dashboard) {
        super(dashboard);
    }

    @Override
    public String display() {
        return super.display() + " + News Widget";
    }
    @Override
    public void layout() {
        // super.layout();
        System.out.println("News Widget Layout");
    }
}