import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BookDatabase book = BookDatabase.getInstance();

        String [] books = {"Harry Potter", "Narnia", "Diary ng Panget"};
        book.addBook(books);

        System.out.println("-----------List of Books-----------");
        book.viewBook();


        System.out.println("---------Remove Book by Book ID-----------");
        System.out.print("Enter bookId to remove: ");
        int id = scan.nextInt();

        book.removeBook(id);
        System.out.println("-------------Available Books--------------");
        book.viewBook();
    }
}
