package ecom;
import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int productId) {
        for (Product product : products) {
            if (product.productId == productId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == productId) {
                return products[mid];
            }
            if (products[mid].productId < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Shirt", "Clothing"),
            new Product(4, "Blender", "Home Appliances"),
            new Product(5, "Book", "Books")
        };

        // Linear Search
        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, 3);
        System.out.println(result1 != null ? result1 : "Product not found");

        // Sort products by productId for Binary Search
        Arrays.sort(products, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return Integer.compare(p1.productId, p2.productId);
            }
        });

        // Binary Search
        System.out.println("Binary Search:");
        Product result2 = binarySearch(products, 3);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}