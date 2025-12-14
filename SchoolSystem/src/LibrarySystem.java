import java.util.Stack;

public class LibrarySystem {
    private Stack<String> returnStack = new Stack<>();

    public void returnBook(String bookTitle) {
        returnStack.push(bookTitle);
        System.out.println("[Library] Book Returned: " + bookTitle);
    }

    public void viewRecentReturns() {
        System.out.println("\n--- Recently Returned Books (LIFO) ---");
        while (!returnStack.isEmpty()) {
            System.out.println(returnStack.pop());
        }
    }
}
