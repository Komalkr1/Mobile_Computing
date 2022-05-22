package com.example.phonicsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG="MainActivity2";
    ImageView openImg;
    String inputLetter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d(TAG, " onCreate Activity Main 2 i.e. Alphabet Image Show");

        openImg=findViewById(R.id.imageView);
        inputLetter=getIntent().getStringExtra("input");
        switch (inputLetter) {

            case "a":
                openImg.setImageResource(R.drawable.a);
                break;
            case "b":
                openImg.setImageResource(R.drawable.b);
                break;
            case "c":
                openImg.setImageResource(R.drawable.c);
                break;
            case "d":
                openImg.setImageResource(R.drawable.d);
                break;
            case "e":
                openImg.setImageResource(R.drawable.e);
                break;
            case "f":
                openImg.setImageResource(R.drawable.f);
                break;
            case "g":
                openImg.setImageResource(R.drawable.g);
                break;
            case "h":
                openImg.setImageResource(R.drawable.h);
                break;
            case "i":
                openImg.setImageResource(R.drawable.i);
                break;
            case "j":
                openImg.setImageResource(R.drawable.j);
                break;
            case "k":
                openImg.setImageResource(R.drawable.k);
                break;
            case "l":
                openImg.setImageResource(R.drawable.l);
                break;
            case "m":
                openImg.setImageResource(R.drawable.m);
                break;
            case "n":
                openImg.setImageResource(R.drawable.n);
                break;
            case "o":
                openImg.setImageResource(R.drawable.o);
                break;
            case "p":
                openImg.setImageResource(R.drawable.p);
                break;
            case "q":
                openImg.setImageResource(R.drawable.q);
                break;
            case "r":
                openImg.setImageResource(R.drawable.r);
                break;
            case "s":
                openImg.setImageResource(R.drawable.s);
                break;
            case "t":
                openImg.setImageResource(R.drawable.t);
                break;
            case "u":
                openImg.setImageResource(R.drawable.u);
                break;
            case "v":
                openImg.setImageResource(R.drawable.v);
                break;
            case "w":
                openImg.setImageResource(R.drawable.w);
                break;
            case "x":
                openImg.setImageResource(R.drawable.x);
                break;
            case "y":
                openImg.setImageResource(R.drawable.y);
                break;
            default:
                openImg.setImageResource(R.drawable.z);;
        }
    }

    @Override

    protected void onStart(){
        super.onStart();
        Log.d(TAG, " onStart Activity Main 2 i.e. Alphabet Image Show");
    }

    @Override

    protected void onResume(){
        super.onResume();
        Log.d(TAG, " onResume Activity Main 2 i.e. Alphabet Image Show");
    }

    @Override

    protected void onPause(){
        super.onPause();
        Log.d(TAG, " onPause Activity Main 2 i.e. Alphabet Image Show");
    }

    @Override

    protected void onStop(){
        super.onStop();
        Log.d(TAG, " onStop Activity Main 2 i.e. Alphabet Image Show");
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " onDestroy Activity Main 2 i.e. Alphabet Image Show");
    }

    @Override

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, " onRestart Activity Main 2 i.e. Alphabet Image Show");
    }
}