package com.example.phonicsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView openImg;
    String inputLetter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


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
}