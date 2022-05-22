package com.example.phonicsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class WelldonePage extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG="MainActivity5";

    Button rtrnBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welldone_page);

        Log.d(TAG, " onCreate Activity Main 5 i.e. WellDone Page");

        rtrnBtn=findViewById(R.id.button2);
        rtrnBtn.setOnClickListener(this);
    }

    @Override

    public void onClick(View v) {
        if(v.getId()==R.id.button2) {
            Intent intent = new Intent(WelldonePage.this, MainActivity.class);
            startActivity(intent);
        }

    }

    @Override

    protected void onStart(){
        super.onStart();
        Log.d(TAG, " onStart Activity Main 5 i.e. WellDone Page");
    }

    @Override

    protected void onResume(){
        super.onResume();
        Log.d(TAG, " onResume Activity Main 5 i.e. WellDone Page");
    }

    @Override

    protected void onPause(){
        super.onPause();
        Log.d(TAG, " onPause Activity Main 5 i.e. WellDone Page");
    }

    @Override

    protected void onStop(){
        super.onStop();
        Log.d(TAG, " onStop Activity Main 5 i.e. WellDone Page");
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " onDestroy Activity Main 5 i.e. WellDone Page");
    }

    @Override

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, " onRestart Activity Main 5 i.e. WellDone Page");
    }
}