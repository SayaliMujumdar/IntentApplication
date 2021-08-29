package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.About);

    }
    /*
    public void Navigation(View v)
    {
        Intent i =new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("Key1","Hello you are in other activity ");
        startActivity(i);

    }
    */
    public void About(View v)
    {
        Intent i =new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("Key1","Hello you are in other activity ");
        startActivity(i);

    }
    public void Contact(View v)
    {
        Intent i =new Intent(MainActivity.this,Contacts.class);
        i.putExtra("Key1","Hello you are in other activity ");
        startActivity(i);

    }
    public void Departments(View v)
    {
        Intent i =new Intent(MainActivity.this,Departments.class);
        i.putExtra("Key1","Hello you are in other activity ");
        startActivity(i);

    }


}