package LMS;

import java.util.ArrayList;
import java.util.Comparator;

public class Library_bin {
    private ArrayList<Book> books;

    public Library_bin() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        // Ensure books are sorted after each addition
        books.sort(Comparator.comparing(b -> b.title));
    }

    // Binary search for book by title
    public Book findBookByTitleBinary(String title) {
        int low = 0;
        int high = books.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books.get(mid).title.compareToIgnoreCase(title);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return books.get(mid); // Book found
            }
        }
        return null; // Book not found
    }
}
