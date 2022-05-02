package com.example.counter;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button inc= findViewById(R.id.Increment_btn);
        TextView counterVal= findViewById(R.id.textView);
        Button reset=findViewById(R.id.reset_btn);
        Button decr=findViewById(R.id.decrement_btn);

        inc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                counter ++;
                counterVal.setText(Integer.toString(counter));
            }
        });

        decr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                if(counter!=0)
                    counter--;
                counterVal.setText(Integer.toString(counter));
            }
        });

        reset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                counter=0;
                counterVal.setText(Integer.toString(counter));
            }
        });
    }
}