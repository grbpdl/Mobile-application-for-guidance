package com.example.roadmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
    }
    public void Academic(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Screenacademic.class);
        startActivity(intent);
    }
    public void Career(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Screencareer.class);
        startActivity(intent);
    }
    public void Government(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Screengoverment.class);
        startActivity(intent);
    }
    public void Suggest(View view)
    {
        //handling lets start click here
        //building intent to go to next activity
        Intent intent=new Intent(this,Screensuggest.class);
        startActivity(intent);
    }
}