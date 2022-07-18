package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Collections;

public class MainActivity<ArrayList> extends AppCompatActivity {

    ListView listView;
    Button button2;
    EditText textView;
    java.util.ArrayList<String> studentList=new java.util.ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView2);
        button2=findViewById(R.id.button2);
        textView=findViewById(R.id.textView2);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, studentList);
        textView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                textView.setText("");

            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                studentList.add(textView.getText().toString());
                arrayAdapter.notifyDataSetChanged();
            }
        });



        listView.setAdapter(arrayAdapter);



    }
}




