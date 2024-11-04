import java.sql.*;

public class DatabaseHelper {
    private Connection conn;

    public DatabaseHelper() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db", "user", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void executeUpdate(String query) {
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet executeQuery(String query) {
        ResultSet rs = null;
        try (Statement stmt = conn.createStatement()) {
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
