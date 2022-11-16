package com.example.roadmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screencareer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screencareer);
    }
    public void C1(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Career1.class);
        startActivity(intent);
    }public void C2(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Career2.class);
        startActivity(intent);
    }public void C3(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Career3.class);
        startActivity(intent);
    }public void C4(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Career4.class);
        startActivity(intent);
    }public void C5(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Career5.class);
        startActivity(intent);
    }
}