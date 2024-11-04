import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LibraryManagementSystem {
    private Connection conn;

    public LibraryManagementSystem() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db", "user", "password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addBook(String title, String author) {
        
    }

    public void lendBook(int bookId, int memberId) {
      
    }

    public void returnBook(int bookId) {
        
    }

    public ResultSet searchBooks(String keyword) {
        
        return null;
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        
    }
}
