import java.util.HashMap;
import java.util.Map;
public class BookDatabase {
    private BookDatabase() {}
    private static BookDatabase instance;
    private Map<Integer, String> bookMap = new HashMap<>();
    private int bookId = 1;

    public static BookDatabase getInstance() {
        if (instance == null) {
            instance = new BookDatabase();
        }
        return instance;
    }
    public void addBook(String [] bookName){
        for (String book : bookName) {
            bookMap.put(bookId, book);
            bookId++;
        }
    }
    public void viewBook(){
        if (bookMap.isEmpty()) {
            System.out.println("No books in the database.");
        } else {
            for (Map.Entry<Integer, String> entry : bookMap.entrySet()) {
                System.out.println("Book " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }
    public void removeBook(int bookId){
        if (bookMap.containsKey(bookId)) {
            System.out.println("The Book '" + bookMap.remove(bookId) + "' is remove.");
        } else {
            System.out.println("Book not found with ID " + bookId);
        }

    }
}
