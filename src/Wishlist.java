import java.util.ArrayList;
import java.util.List;

public class Wishlist {
    private final List<Book> wishlist = new ArrayList<>();

    public void addToWishlist(Book book) { wishlist.add(book); }
    public void displayWishlist() {
        System.out.println("\nWishlist:");
        for (Book book : wishlist) {
            System.out.println(book.getTitle());
        }
    }
}
