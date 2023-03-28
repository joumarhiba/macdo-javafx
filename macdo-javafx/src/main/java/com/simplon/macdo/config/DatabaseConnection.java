package com.simplon.macdo.config;

public class DatabaseConnection {

    private Connection conn;

    public void connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "myusername";
            String password = "mypassword";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL database.");
        } catch (SQLException e) {
            System.out.println("Failed to connect to MySQL database.");
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            conn.close();
            System.out.println("Disconnected from MySQL database.");
        } catch (SQLException e) {
            System.out.println("Failed to disconnect from MySQL database.");
            e.printStackTrace();
        }
    }

}
