public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");
        Image image3 = new ProxyImage("image1.jpg"); // Should be cached

        System.out.println("First display call:");
        image1.display();

        System.out.println("\nSecond display call:");
        image2.display();

        System.out.println("\nThird display call:");
        image3.display();
    }
}