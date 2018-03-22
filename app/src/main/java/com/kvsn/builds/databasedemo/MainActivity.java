package com.kvsn.builds.databasedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addcon(View v)
    {
        Intent i = new Intent(this , Add.class);
        startActivity(i);
    }
    public void viewcon(View v)
    {
        Intent i = new Intent(this , com.kvsn.builds.databasedemo.View.class);
        startActivity(i);
    }
    public void upcon(View v)
    {
        Intent i = new Intent(this , Update.class);
        startActivity(i);
    }
    public void searchcon(View v)
    {
        Intent i = new Intent(this , Search.class);
        startActivity(i);
    }
    public void delcon(View v)
    {
        Intent i = new Intent(this , Delete.class);
        startActivity(i);
    }
}
