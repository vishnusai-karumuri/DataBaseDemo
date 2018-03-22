package com.kvsn.builds.databasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Add extends AppCompatActivity
{
    EditText et1 , et2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        et1 = findViewById(R.id.add_et1);
        et2 = findViewById(R.id.add_et2);
    }
    public void submit(View v)
    {

    }
}
