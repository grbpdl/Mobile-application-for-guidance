package com.example.roadmap;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Screensuggest extends AppCompatActivity {
//
//    Database dtb=new Database(this);
//    EditText tpc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screensuggest);
//        tpc=(EditText) findViewById(R.id.topic);
    }
    public void Thanks(View view) {
        TextView message = findViewById(R.id.thank);
        message.setText("sucessful");
//        String topic = tpc.getText().toString();
//        try{
//
//        dtb.Insert(topic);
//            message.setText("sucessful");
//        }
//        catch(Exception e) {
//            message.setText(e.toString());
//        }
//        finally {
//            String result = "Thank you for your suggestion  ";
//            message.setText(result);
//        }

    }




}

