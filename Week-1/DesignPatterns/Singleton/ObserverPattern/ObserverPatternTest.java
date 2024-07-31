// ObserverPatternTest.java
public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("TechCorp");

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Setting price to $100.00");
        stockMarket.setPrice(100.00);

        System.out.println("\nSetting price to $105.50");
        stockMarket.setPrice(105.50);
}
}