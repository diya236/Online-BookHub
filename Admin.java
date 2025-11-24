public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    public void addBookToInventory(Book book) {
        System.out.println("Added " + book.getTitle() + " to inventory.");
    }
}
