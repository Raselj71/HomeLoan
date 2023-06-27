package com.techtutor.homeloan;

import static com.techtutor.homeloan.database.Mydata.DBPASSWORD;
import static com.techtutor.homeloan.database.Mydata.DBUSERNAME;
import static com.techtutor.homeloan.database.Mydata.URL;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


import com.techtutor.homeloan.database.Mydata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MainActivity extends AppCompatActivity {
         TextView textView;
         Connection c;
         Statement s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textview);

        String query="SELECT * FROM `userdata` WHERE id='1';";
        Mydata mydata=new Mydata();
        try {
         ResultSet rs = mydata.s.executeQuery(query);

            System.out.println(rs);





        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}