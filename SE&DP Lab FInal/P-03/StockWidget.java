public class StockWidget extends WidgetDecorator {
    public StockWidget(Dashboard dashboard) {
        super(dashboard);
    }

    @Override
    public String display() {
        return super.display() + " + Stock Widget";
    }
    @Override
    public void layout() {
        // super.layout();
        System.out.println(" Stock Widget");
    }
}