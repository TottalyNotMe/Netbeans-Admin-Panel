package POS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

    public static Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/pos?serverTimezone=UTC";
        String user = "root";
        String password = ""; // Kosongkan jika root tanpa password

        try {
            // Optional: Load the MySQL JDBC Driver (newer JDBC doesn't need this)
            // Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        try {
            Connection c = koneksi.getConnection();
            if (c != null) {
                System.out.println(String.format("Konek database '%s' sukses!", c.getCatalog()));
                c.close();
            } else {
                System.out.println("Koneksi gagal: null");
            }
        } catch (SQLException e) {
            System.out.println("Error saat koneksi: " + e.getMessage());
        }
    }
}
