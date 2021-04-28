package controller;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class Connexion {

    private static Connection conn;

    public Connexion() throws ClassNotFoundException {
        try {
            String url = "";
            String user = "";
            String password = "";
            String driver = "";

            //read the file
            FileReader file = new FileReader("login.txt");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            ArrayList<String> list = new ArrayList<>();

            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }
            reader.close();

            url = list.get(0);
            user = list.get(1);
            password = list.get(2);
            driver = list.get(3);
            
            System.out.println("url : " + url + " user : " + user + " pwd : " + password + " driver : " + driver );

            Class.forName(driver);

            //create connection to the database
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to local !");

        } catch (SQLException sql) {
            System.out.println("SQL Exception " + sql.getMessage());
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND : " + ex.getMessage());
        } catch (IOException e) {
            System.out.println("IO exception : " + e.getMessage());
        }
    }

    // static because we need to use it in the ControlLogin class
    public static Connection getConn() {
        return conn;
    }
    
    public void closeConn(){
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("SQL CONNEXION ERROR CLOSE " + ex.getMessage());
        }
    }
}
