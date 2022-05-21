package com.example.phonicsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelldonePage extends AppCompatActivity implements View.OnClickListener{

    Button rtrnBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welldone_page);

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
}