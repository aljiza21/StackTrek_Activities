import java.util.HashMap;
import java.util.Map;

public class BookDatabase {
    private static BookDatabase instance;
    Map<Integer, String> bookMap;
    private int bookId;

    public BookDatabase() {
        bookMap = new HashMap<>();
        bookId = 1;
    }
    public static BookDatabase getInstance() {
        if (instance == null) {
            instance = new BookDatabase();
        }
        return instance;
    }

    public void addBook(String [] bookName){
        for (String book : bookName) {
            this.bookMap.put(bookId, book);
            bookId++;
        }

    }

    public void viewBook(){
        for (Map.Entry<Integer, String> entry : bookMap.entrySet()) {
            System.out.println("Book " + entry.getKey() + ": " + entry.getValue());
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
