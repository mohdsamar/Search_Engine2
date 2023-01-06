package com.example.search_engine2;

import javafx.event.ActionEvent;

import java.sql.*;

public class DatabaseConnection {
    String MySQLURL = "jdbc:mysql://localhost:3306/Search_Engine2?useSSL=false";
    String DatabaseUsername = "root";
    String Databasepassword = "Smr9557@";
    Connection con = null;

    DatabaseConnection() throws SQLException {
        //Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(MySQLURL, DatabaseUsername, Databasepassword);
        System.out.print("Connection to the database complete");
    }


    public ResultSet executeQuery(String query) throws SQLException {
        //for reading
        ResultSet ans = null;
        Statement statement = con.createStatement();
        ans = statement.executeQuery(query);
        return ans;
    }

    public int executeUpdate(String query) throws SQLException {
        // this must be an update query
        int ans = 0;
        Statement statement = con.createStatement();
        ans = statement.executeUpdate(query);
        return ans;
    }
}

