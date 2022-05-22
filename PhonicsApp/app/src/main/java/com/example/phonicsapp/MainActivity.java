package com.example.phonicsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG="MainActivity";

    Button learning,test,repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, " onCreate Activity Main");

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
            default:
                intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);

        }

    }

    @Override

    protected void onStart(){
        super.onStart();
        Log.d(TAG, " onStart Activity Main");
    }

    @Override

    protected void onResume(){
        super.onResume();
        Log.d(TAG, " onResume Activity Main");
    }

    @Override

    protected void onPause(){
        super.onPause();
        Log.d(TAG, " onPause Activity Main");
    }

    @Override

    protected void onStop(){
        super.onStop();
        Log.d(TAG, " onStop Activity Main");
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " onDestroy Activity Main");
    }

    @Override

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, " onRestart Activity Main");
    }

}