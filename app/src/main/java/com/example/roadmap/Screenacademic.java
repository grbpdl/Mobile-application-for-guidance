package com.example.roadmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screenacademic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenacademic);
    }
    public void Engineer(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Eng.class);
        startActivity(intent);
    }public void Doctor(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Doc.class);
        startActivity(intent);
    }public void Ca(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,C_a.class);
        startActivity(intent);
    }public void Air_hostress(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Air.class);
        startActivity(intent);
    }public void Pilot(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Pil.class);
        startActivity(intent);
    }
}