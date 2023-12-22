package com.example.ordercraft.GestionArticles;

import java.sql.*;
import com.mysql.jdbc.Connection;
public class Cnx {
    private static String driver="com.mysql.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/getioncommande";
    private static String user="root";
    private static String password="";
    public static Connection con=null;
    public static Connection getConnection()throws Exception{
        Class.forName(driver);
        return (Connection) DriverManager.getConnection(url,user,password);
    }
    public static void Sedeconnecter() throws Exception{
        if(con!=null)
            con.close();
    }
}