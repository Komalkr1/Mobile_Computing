package com.example.phonicsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button learning,test,repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        learning = findViewById(R.id.learn);
        learning.setOnClickListener(this);

        test = findViewById(R.id.testbtn);
        test.setOnClickListener(this);

        repo = findViewById(R.id.repo);
        repo.setOnClickListener(this);
    }
    @Override

    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.learn:
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
                break;
            case R.id.repo:
                Uri uri = Uri.parse("https://github.com/Komalkr1/Mobile_Computing");
                intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
                break;

        }

    }
}