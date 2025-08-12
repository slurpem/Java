import java.sql.*;
public class Program14 {
    public static void main(String[] args) {
        try {
            // Optional, but safe to include:
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "");
            System.out.println("Connected");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println("StudentId = " + rs.getInt(1));
                System.out.println("StudentName = " + rs.getString(2));
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
