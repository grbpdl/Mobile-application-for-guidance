package com.example.roadmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screengoverment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screengoverment);
    }
    public void C(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Cship.class);
        startActivity(intent);
    }
    public void P(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Pport.class);
        startActivity(intent);
    }
    public void D(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Dliscence.class);
        startActivity(intent);
    }
    public void V(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Vcard.class);
        startActivity(intent);
    }

}