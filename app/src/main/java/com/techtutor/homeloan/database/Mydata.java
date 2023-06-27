package com.techtutor.homeloan.database;
import android.util.Log;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mydata {


    public static final String URL = "jdbc:mysql://104.247.108.18:3306/techtuto_ecommerceDB";
    public static final String DBUSERNAME = "techtuto_ecommerceUSER";
    public static final String DBPASSWORD = "p1SGkgB4aU";

    public Statement s;
    public Connection c;
    public Mydata() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try {
           c=DriverManager.getConnection(URL,DBUSERNAME,DBPASSWORD);
           s=c.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}


