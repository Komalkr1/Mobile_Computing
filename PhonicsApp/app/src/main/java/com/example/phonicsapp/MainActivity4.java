package com.example.phonicsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG="MainActivity4";

    Button op1,op2,op3,op4,exitBtn;
    public int mcq=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Log.d(TAG, " onCreate Activity Main 4 i.e. Mcq Test Module");

        op1=findViewById(R.id.Op1);
        op1.setOnClickListener(this);

        op2=findViewById(R.id.Op2);
        op2.setOnClickListener(this);

        op3=findViewById(R.id.Op3);
        op3.setOnClickListener(this);

        op4=findViewById(R.id.Op4);
        op4.setOnClickListener(this);

        exitBtn=findViewById(R.id.exit);
        exitBtn.setOnClickListener(this);

    }
    @Override

    public void onClick(View v) {

        ImageView CurImg=findViewById(R.id.imageView2);

        if(v.getId()==R.id.exit) {
            Intent intent = new Intent(MainActivity4.this, MainActivity.class);
            startActivity(intent);
        }

        if(mcq==1)
        {
            if(v.getId()==R.id.Op1)
            {

                CurImg.setImageResource(R.drawable.zebra);
                op1.setText("a)  X");
                op2.setText("b)  A");
                op3.setText("c)  Z");
                op4.setText("d)  P");
                restoreSettings();
                mcq++;
            }
             else
            {
                v.setBackgroundColor(Color.parseColor("#ffcccb"));
                v.setEnabled(false);
            }

        }
        else if(mcq==2)
        {
            if(v.getId()==R.id.Op3)
            {

                CurImg.setImageResource(R.drawable.ball);
                op1.setText("a)  D");
                op2.setText("b)  R");
                op3.setText("c)  Z");
                op4.setText("d)  B");
                restoreSettings();
                mcq++;
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#ffcccb"));
                v.setEnabled(false);
            }
        }
        else if(mcq==3)
        {
            if(v.getId()==R.id.Op4)
            {

                CurImg.setImageResource(R.drawable.cat);
                op1.setText("a)  C");
                op2.setText("b)  D");
                op3.setText("c)  Z");
                op4.setText("d)  P");
                mcq++;
                restoreSettings();
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#ffcccb"));
                v.setEnabled(false);
            }

        }
        else if(mcq==4)
        {
            if(v.getId()==R.id.Op1)
            {

                CurImg.setImageResource(R.drawable.rainbow);
                op1.setText("a)  X");
                op2.setText("b)  Y");
                op3.setText("c)  O");
                op4.setText("d)  R");
                mcq++;
                restoreSettings();
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#ffcccb"));
                v.setEnabled(false);
            }

        }
        else if(mcq==5)
        {
            if(v.getId()==R.id.Op4)
            {

                CurImg.setImageResource(R.drawable.duck);
                op1.setText("a)  S");
                op2.setText("b)  D");
                op3.setText("c)  W");
                op4.setText("d)  P");
                mcq++;
                restoreSettings();
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#ffcccb"));
                v.setEnabled(false);
            }

        }
        else if(mcq==6)
        {
            if(v.getId()==R.id.Op2)
            {

                CurImg.setImageResource(R.drawable.sun);
                op1.setText("a)  C");
                op2.setText("b)  I");
                op3.setText("c)  S");
                op4.setText("d)  Q");
                mcq++;
                restoreSettings();
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#ffcccb"));
                v.setEnabled(false);
            }

        }
        else if(mcq==7)
        {
            if(v.getId()==R.id.Op3)
            {

                CurImg.setImageResource(R.drawable.mango);
                op1.setText("a)  M");
                op2.setText("b)  A");
                op3.setText("c)  N");
                op4.setText("d)  P");
                restoreSettings();
                mcq++;
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#ffcccb"));
                v.setEnabled(false);
            }
        }
        else
        {
            if(v.getId()==R.id.Op1)
            {
                Intent intent = new Intent(MainActivity4.this, WelldonePage.class);
                startActivity(intent);
            }
            else
            {
                v.setBackgroundColor(Color.parseColor("#ffcccb"));
                v.setEnabled(false);
            }
        }


        }
        private void restoreSettings()
        {
            op1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            op2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            op3.setBackgroundColor(Color.parseColor("#FFFFFF"));
            op4.setBackgroundColor(Color.parseColor("#FFFFFF"));
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);
        }

    @Override

    protected void onStart(){
        super.onStart();
        Log.d(TAG, " onStart Activity Main 4 i.e. Mcq Test Module");
    }

    @Override

    protected void onResume(){
        super.onResume();
        Log.d(TAG, " onResume Activity Main 4 i.e. Mcq Test Module");
    }

    @Override

    protected void onPause(){
        super.onPause();
        Log.d(TAG, " onPause Activity Main 4 i.e. Mcq Test Module");
    }

    @Override

    protected void onStop(){
        super.onStop();
        Log.d(TAG, " onStop Activity Main 4 i.e. Mcq Test Module");
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " onDestroy Activity Main 4 i.e. Mcq Test Module");
    }

    @Override

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, " onRestart Activity Main 4 i.e. Mcq Test Module");
    }
}

