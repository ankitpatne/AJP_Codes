// Create a database and perform the operation as insert and retrieve the data from the database using JDBC. 

import java.sql.*;

public class Ex4 {
    public static void main(String[] args) {
        try {
            // register the driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connect to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "star123");

            // Create a table
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE DATABASE IF NOT EXISTS school");
            stmt.execute("USE school");
            stmt.execute("CREATE TABLE IF NOT EXISTS students (name VARCHAR(50), age INTEGER)");

            // Insert data
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO students (name, age) VALUES (?, ?)");
            pstmt.setString(1, "Mittal");
            pstmt.setInt(2, 22);
            pstmt.executeUpdate();

            // Retrieve data
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " is " + rs.getInt("age") + " years old");
            }

            // Close the connection
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}