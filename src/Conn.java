import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL database
            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankmanagementsystem", // change port if needed
                    "root",  // your MySQL username
                    "sneha"  // your MySQL password
            );

            // Create statement object
            s = c.createStatement();
            System.out.println("✅ Database connected successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
