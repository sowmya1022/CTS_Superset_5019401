// MobileApp.java
public class MobileApp implements Observer {
    @Override
    public void update(String stockName, double price) {
        System.out.println("MobileApp - Stock: " + stockName + ", Price: $" + price);
}
}